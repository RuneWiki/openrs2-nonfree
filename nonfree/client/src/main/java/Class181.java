import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public final class Class181 {

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
	public int anInt5017;

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
	public int anInt5019;

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "Lclient!jt;")
	public Class181 aClass181_1;

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
	public int anInt5021;

	@OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
	public int anInt5022;

	@OriginalMember(owner = "client!jt", name = "k", descriptor = "I")
	public int anInt5024;

	@OriginalMember(owner = "client!jt", name = "l", descriptor = "I")
	public int anInt5025;

	@OriginalMember(owner = "client!jt", name = "n", descriptor = "I")
	public int anInt5027;

	@OriginalMember(owner = "client!jt", name = "p", descriptor = "I")
	public int anInt5029;

	@OriginalMember(owner = "client!jt", name = "u", descriptor = "I")
	public int anInt5032;

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
	public final int anInt5018;

	@OriginalMember(owner = "client!jt", name = "r", descriptor = "B")
	public final byte aByte60;

	@OriginalMember(owner = "client!jt", name = "x", descriptor = "I")
	public final int anInt5035;

	@OriginalMember(owner = "client!jt", name = "i", descriptor = "I")
	private final int anInt5023;

	@OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
	public final int anInt5020;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(IIIIB)V")
	public Class181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt5018 = arg3;
		this.aByte60 = arg4;
		this.anInt5035 = arg1;
		this.anInt5023 = arg0;
		this.anInt5020 = arg2;
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!jt;I)V")
	public Class181(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1) {
		this.aClass181_1 = arg0;
		this.anInt5035 = this.aClass181_1.anInt5035 + arg1;
		this.anInt5023 = this.aClass181_1.anInt5023;
		this.anInt5020 = arg1 + this.aClass181_1.anInt5020;
		this.anInt5018 = this.aClass181_1.anInt5018 + arg1;
		this.aByte60 = this.aClass181_1.aByte60;
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(B)Lclient!ih;")
	public Class160 method4269() {
		return Static580.method2376(this.anInt5023);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIZI)Lclient!jt;")
	public Class181 method4270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return new Class181(this.anInt5023, arg0, arg2, arg1, this.aByte60);
	}
}
