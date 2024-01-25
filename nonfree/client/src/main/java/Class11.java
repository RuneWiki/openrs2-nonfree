import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class11 {

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
	public int anInt391;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "Lclient!rk;")
	public Class257 aClass257_1;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
	public int anInt396;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "Z")
	public boolean aBoolean15 = false;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)Z")
	public boolean method428() {
		return this.aClass257_1.aClass171_128.method4327(this.anInt391);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZLclient!qa;B)Lclient!ha;")
	public Class2 method429(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class122 arg2) {
		@Pc(24) long local24 = (long) ((arg1 ? 262144 : 0) | this.anInt391 | arg0 << 16 | arg2.anInt8823 << 19);
		@Pc(32) Class2 local32 = (Class2) this.aClass257_1.aClass313_53.method7406(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass257_1.aClass171_128.method4327(this.anInt391)) {
			@Pc(61) Class136 local61 = Static552.method3541(this.aClass257_1.aClass171_128, this.anInt391, 0);
			if (local61 != null) {
				local61.anInt4050 = local61.anInt4052 = local61.anInt4051 = local61.anInt4053 = 0;
				if (arg1) {
					local61.method3540();
				}
				for (@Pc(81) int local81 = 0; local81 < arg0; local81++) {
					local61.method3539();
				}
			}
			local32 = arg2.method7220(local61);
			if (local32 != null) {
				this.aClass257_1.aClass313_53.method7399(local24, local32);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!ge;IB)V")
	private void method431(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt391 = arg0.method3967();
		} else if (arg1 == 2) {
			this.anInt396 = arg0.method3920();
		} else if (arg1 == 3) {
			this.aBoolean15 = true;
		} else if (arg1 == 4) {
			this.anInt391 = -1;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!ge;B)V")
	public void method432(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3922();
			if (local9 == 0) {
				return;
			}
			this.method431(arg0, local9);
		}
	}
}
