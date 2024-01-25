import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public final class Class146 {

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "I")
	public int anInt3341;

	@OriginalMember(owner = "client!hba", name = "e", descriptor = "I")
	public int anInt3343;

	@OriginalMember(owner = "client!hba", name = "g", descriptor = "I")
	public int anInt3344;

	@OriginalMember(owner = "client!hba", name = "j", descriptor = "I")
	public int anInt3347 = 128;

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
	public int anInt3340 = 128;

	@OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
	public int anInt3342;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(I)V")
	public Class146(@OriginalArg(0) int arg0) {
		this.anInt3342 = arg0;
	}

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(IIIIII)V")
	private Class146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3342 = arg0;
		this.anInt3341 = arg3;
		this.anInt3347 = arg1;
		this.anInt3343 = arg4;
		this.anInt3344 = arg5;
		this.anInt3340 = arg2;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)Lclient!hba;")
	public Class146 method2996() {
		return new Class146(this.anInt3342, this.anInt3347, this.anInt3340, this.anInt3341, this.anInt3343, this.anInt3344);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(ZLclient!hba;)V")
	public void method2997(@OriginalArg(1) Class146 arg0) {
		this.anInt3344 = arg0.anInt3344;
		this.anInt3342 = arg0.anInt3342;
		this.anInt3347 = arg0.anInt3347;
		this.anInt3343 = arg0.anInt3343;
		this.anInt3341 = arg0.anInt3341;
		this.anInt3340 = arg0.anInt3340;
	}
}
