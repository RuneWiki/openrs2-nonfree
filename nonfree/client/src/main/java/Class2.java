import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class2 {

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
	public int anInt9;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	public int anInt12;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Z")
	public boolean aBoolean1 = false;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!pi;II)V")
	private void method6(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub24 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.anInt12 = arg1.method3085();
		} else if (arg0 == 2) {
			this.anInt9 = arg1.method3063();
		} else if (arg0 == 3) {
			this.aBoolean1 = true;
		} else if (arg0 == 4) {
			this.anInt12 = -1;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZII)Lclient!ta;")
	public Class58_Sub2 method7(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(23) Class58_Sub2 local23 = (Class58_Sub2) Static162.aClass172_30.method4347((long) (arg1 << 16 | this.anInt12 | (arg0 ? 262144 : 0)));
		if (local23 != null) {
			return local23;
		}
		Static185.aClass22_65.method656(this.anInt12);
		local23 = Static205.method3272(Static185.aClass22_65, this.anInt12);
		if (local23 != null) {
			local23.method3978(Static31.anInt650, Static105.anInt2107, Static183.anInt3661);
			local23.anInt5022 = local23.anInt5028;
			local23.anInt5025 = local23.anInt5023;
			if (arg0) {
				local23.method3973();
			}
			for (@Pc(70) int local70 = 0; local70 < arg1; local70++) {
				local23.method3983();
			}
			Static162.aClass172_30.method4345(local23, (long) (this.anInt12 | arg1 << 16 | (arg0 ? 262144 : 0)));
		}
		return local23;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!pi;I)V")
	public void method13(@OriginalArg(1) Class4_Sub24 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method3110();
			if (local5 == 0) {
				return;
			}
			this.method6(local5, arg0, arg1);
		}
	}
}
