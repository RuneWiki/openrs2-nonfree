import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gfa")
public final class Class128 implements Interface16 {

	@OriginalMember(owner = "client!gfa", name = "j", descriptor = "Lclient!nw;")
	private final Class259 aClass259_1;

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "Lclient!dk;")
	private final Class82 aClass82_1;

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lclient!nw;Lclient!dk;)V")
	public Class128(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class82 arg1) {
		this.aClass259_1 = arg0;
		this.aClass82_1 = arg1;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8281() {
		return this.aClass259_1.method5661();
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8282() {
		@Pc(15) Class195 local15 = this.aClass259_1.method5662(this.aClass82_1.anInt2058);
		if (local15 == null) {
			return;
		}
		@Pc(34) int local34 = this.aClass82_1.aClass266_6.method5919(Static95.anInt9415, this.aClass82_1.anInt2066) + this.aClass82_1.anInt2065;
		@Pc(49) int local49 = this.aClass82_1.aClass131_8.method3034(this.aClass82_1.anInt2062, Static195.anInt3525) + this.aClass82_1.anInt2059;
		if (this.aClass82_1.aBoolean160) {
			Static119.aClass95_4.method8062(local34, local49, this.aClass82_1.anInt2066, this.aClass82_1.anInt2062, this.aClass82_1.anInt2061, 0);
		}
		local49 += this.method3006(local49, local34, local15.aString67, Static293.aClass67_14) * 12;
		local49 += 8;
		if (this.aClass82_1.aBoolean160) {
			Static119.aClass95_4.method8024(local34, local49, this.aClass82_1.anInt2066 + local34 - 1, local49, this.aClass82_1.anInt2061, 0);
		}
		local49++;
		local49 += this.method3006(local49, local34, local15.aString68, Static293.aClass67_14) * 12;
		local49 += 5;
		@Pc(131) int local131 = local49 + this.method3006(local49, local34, local15.aString66, Static293.aClass67_14) * 12;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIILjava/lang/String;Lclient!da;)I")
	private int method3006(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) Class67 arg3) {
		return arg3.method7672(arg0 + 5, arg1 + 5, (Class6[]) null, (int[]) null, 0, arg2, this.aClass82_1.anInt2066 - 10, this.aClass82_1.anInt2060, 0, (Class1) null, 0, 0, this.aClass82_1.anInt2063, 0, this.aClass82_1.anInt2062 - 10);
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V")
	@Override
	public void method8280() {
	}
}
