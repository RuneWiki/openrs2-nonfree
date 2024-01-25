import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class297 implements Interface9 {

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "Lclient!kh;")
	private final Class198 aClass198_1;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "Lclient!mt;")
	private final Class238 aClass238_2;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!mt;Lclient!kh;)V")
	public Class297(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class198 arg1) {
		this.aClass198_1 = arg1;
		this.aClass238_2 = arg0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7668() {
		return this.aClass238_2.method6464();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILjava/lang/String;ILclient!da;B)I")
	private int method7671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) Class59 arg3) {
		return arg3.method9576(0, arg2, this.aClass198_1.anInt5622, this.aClass198_1.anInt5620 - 10, arg1 + 5, 0, 0, this.aClass198_1.anInt5625 - 10, 0, (Class1) null, this.aClass198_1.anInt5623, 0, (int[]) null, arg0 + 5, (Class71[]) null);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
	@Override
	public void method7670() {
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7669() {
		@Pc(19) Class147 local19 = this.aClass238_2.method6465(this.aClass198_1.anInt5618);
		if (local19 == null) {
			return;
		}
		@Pc(35) int local35 = this.aClass198_1.aClass236_3.method6431(this.aClass198_1.anInt5620, Static26.anInt458) + this.aClass198_1.anInt5626;
		@Pc(49) int local49 = this.aClass198_1.aClass103_3.method3186(Static340.anInt6390, this.aClass198_1.anInt5625) + this.aClass198_1.anInt5629;
		if (this.aClass198_1.aBoolean424) {
			Static607.aClass101_15.method8129(local35, local49, this.aClass198_1.anInt5620, this.aClass198_1.anInt5625, this.aClass198_1.anInt5624, 0);
		}
		local49 += this.method7671(local49, local35, local19.aString57, Static253.aClass59_5) * 12;
		local49 += 8;
		if (this.aClass198_1.aBoolean424) {
			Static607.aClass101_15.method8091(local35, local49, this.aClass198_1.anInt5620 + local35 - 1, local49, this.aClass198_1.anInt5624, 0);
		}
		local49++;
		local49 += this.method7671(local49, local35, local19.aString56, Static253.aClass59_5) * 12;
		local49 += 5;
		@Pc(131) int local131 = local49 + this.method7671(local49, local35, local19.aString55, Static253.aClass59_5) * 12;
	}
}
