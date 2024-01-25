import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public final class Class114 {

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "Lclient!hv;")
	public Class114 aClass114_2;

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
	public int anInt3457;

	@OriginalMember(owner = "client!hv", name = "h", descriptor = "Lclient!c;")
	public Class40 aClass40_2;

	@OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
	public int anInt3459;

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "I")
	public int anInt3461;

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
	public final int anInt3455;

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
	public final int anInt3458;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(II)V")
	public Class114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3455 = arg1;
		this.anInt3458 = arg0;
	}

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lclient!hv;I)V")
	public Class114(@OriginalArg(0) Class114 arg0, @OriginalArg(1) int arg1) {
		this.aClass114_2 = arg0;
		this.anInt3458 = this.aClass114_2.anInt3458;
		this.aClass40_2 = this.aClass114_2.aClass40_2;
		this.anInt3455 = arg1 + this.aClass114_2.anInt3455;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)Lclient!np;")
	public Class180 method2700() {
		return Static371.method5179(this.anInt3458);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)Lclient!hv;")
	public Class114 method2701(@OriginalArg(0) int arg0) {
		return new Class114(this.anInt3458, arg0);
	}
}
