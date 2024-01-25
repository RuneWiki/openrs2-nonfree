import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public final class Class238 {

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "I")
	public int anInt7656;

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "Lclient!dfa;")
	public Class54 aClass54_8;

	@OriginalMember(owner = "client!oia", name = "d", descriptor = "Lclient!oia;")
	public Class238 aClass238_1;

	@OriginalMember(owner = "client!oia", name = "e", descriptor = "I")
	public int anInt7657;

	@OriginalMember(owner = "client!oia", name = "j", descriptor = "I")
	public int anInt7662;

	@OriginalMember(owner = "client!oia", name = "i", descriptor = "I")
	public final int anInt7661;

	@OriginalMember(owner = "client!oia", name = "f", descriptor = "I")
	public final int anInt7658;

	@OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(II)V")
	public Class238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7661 = arg1;
		this.anInt7658 = arg0;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)Lclient!vba;")
	public Class351 method6341() {
		return Static615.method8358(this.anInt7658);
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(IB)Lclient!oia;")
	public Class238 method6343(@OriginalArg(0) int arg0) {
		return new Class238(this.anInt7658, arg0);
	}
}
