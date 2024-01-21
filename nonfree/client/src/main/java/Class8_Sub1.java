import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "Z")
	public boolean aBoolean14 = false;

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
	private int anInt181 = -32768;

	@OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
	private int anInt192 = 0;

	@OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
	private int anInt186 = 0;

	@OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
	public final int anInt191;

	@OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
	private final int anInt188;

	@OriginalMember(owner = "client!ah", name = "I", descriptor = "I")
	public final int anInt190;

	@OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
	public final int anInt187;

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
	public final int anInt180;

	@OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
	public final int anInt182;

	@OriginalMember(owner = "client!ah", name = "P", descriptor = "Lclient!re;")
	private Class1_Sub3_Sub20 aClass1_Sub3_Sub20_1;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(IIIIIII)V")
	public Class8_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt191 = arg2;
		this.anInt188 = arg0;
		this.anInt190 = arg1;
		this.anInt187 = arg6 + arg5;
		this.anInt180 = arg4;
		this.anInt182 = arg3;
		@Pc(40) int local40 = Static116.method1724(this.anInt188).anInt1908;
		if (local40 == -1) {
			this.aBoolean14 = true;
		} else {
			this.aBoolean14 = false;
			this.aClass1_Sub3_Sub20_1 = Static84.method1279(local40);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)V")
	public void method157(@OriginalArg(0) int arg0) {
		if (this.aBoolean14) {
			return;
		}
		this.anInt192 += arg0;
		while (this.anInt192 > this.aClass1_Sub3_Sub20_1.anIntArray298[this.anInt186]) {
			this.anInt192 -= this.aClass1_Sub3_Sub20_1.anIntArray298[this.anInt186];
			this.anInt186++;
			if (this.anInt186 >= this.aClass1_Sub3_Sub20_1.anIntArray300.length) {
				this.aBoolean14 = true;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "()I")
	@Override
	public int method2668() {
		return this.anInt181;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)Lclient!ee;")
	private Class8_Sub5 method161() {
		@Pc(8) Class1_Sub3_Sub11 local8 = Static116.method1724(this.anInt188);
		@Pc(18) Class8_Sub5 local18;
		if (this.aBoolean14) {
			local18 = local8.method1317(-1);
		} else {
			local18 = local8.method1317(this.anInt186);
		}
		return local18 == null ? null : local18;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class8_Sub5 local7 = this.method161();
		if (local7 != null) {
			local7.method2672(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt181 = local7.method2668();
		}
	}
}
