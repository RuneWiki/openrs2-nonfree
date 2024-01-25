import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class239 {

	@OriginalMember(owner = "client!u", name = "b", descriptor = "I")
	public int anInt6503;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "I")
	public int anInt6506;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "I")
	public int anInt6507;

	@OriginalMember(owner = "client!u", name = "i", descriptor = "I")
	public int anInt6509;

	@OriginalMember(owner = "client!u", name = "k", descriptor = "I")
	public int anInt6511;

	@OriginalMember(owner = "client!u", name = "s", descriptor = "I")
	public int anInt6517;

	@OriginalMember(owner = "client!u", name = "t", descriptor = "I")
	public int anInt6518;

	@OriginalMember(owner = "client!u", name = "u", descriptor = "I")
	public int anInt6519;

	@OriginalMember(owner = "client!u", name = "w", descriptor = "I")
	public int anInt6520;

	@OriginalMember(owner = "client!u", name = "x", descriptor = "Lclient!u;")
	public Class239 aClass239_1;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "I")
	public final int anInt6502;

	@OriginalMember(owner = "client!u", name = "p", descriptor = "I")
	private final int anInt6516;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "I")
	public final int anInt6505;

	@OriginalMember(owner = "client!u", name = "r", descriptor = "B")
	public final byte aByte86;

	@OriginalMember(owner = "client!u", name = "h", descriptor = "I")
	public final int anInt6508;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(IIIIB)V")
	public Class239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt6502 = arg1;
		this.anInt6516 = arg0;
		this.anInt6505 = arg3;
		this.aByte86 = arg4;
		this.anInt6508 = arg2;
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!u;I)V")
	public Class239(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1) {
		this.aClass239_1 = arg0;
		this.aByte86 = this.aClass239_1.aByte86;
		this.anInt6505 = this.aClass239_1.anInt6505 + arg1;
		this.anInt6502 = this.aClass239_1.anInt6502 + arg1;
		this.anInt6516 = this.aClass239_1.anInt6516;
		this.anInt6508 = this.aClass239_1.anInt6508 + arg1;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIII)Lclient!u;")
	public Class239 method5012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class239(this.anInt6516, arg0, arg2, arg1, this.aByte86);
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)Lclient!kb;")
	public Class131 method5013() {
		return Static217.method2877(this.anInt6516);
	}
}
