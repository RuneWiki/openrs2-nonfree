import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class146 {

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
	public int anInt4307;

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
	public int anInt4313;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "Z")
	public boolean aBoolean304 = false;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!fd;II)V")
	private void method3589(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt4313 = arg0.method4653();
		} else if (arg2 == 2) {
			this.anInt4307 = arg0.method4655();
		} else if (arg2 == 3) {
			this.aBoolean304 = true;
		} else if (arg2 == 4) {
			this.anInt4313 = -1;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZLclient!fd;)V")
	public void method3593(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub10 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method4666();
			if (local9 == 0) {
				return;
			}
			this.method3589(arg1, arg0, local9);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZI)Lclient!fe;")
	public Class56_Sub1 method3594(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(23) Class56_Sub1 local23 = (Class56_Sub1) Static210.aClass26_41.method518((long) (arg1 << 16 | this.anInt4313 | (arg0 ? 262144 : 0)));
		if (local23 != null) {
			return local23;
		}
		Static309.aClass58_103.method1359(this.anInt4313);
		local23 = Static269.method3016(Static309.aClass58_103, this.anInt4313);
		if (local23 != null) {
			local23.method1311(Static256.anInt4868, Static5.anInt97, Static220.anInt3963);
			local23.anInt3412 = local23.anInt3408;
			local23.anInt3410 = local23.anInt3413;
			if (arg0) {
				local23.method1312();
			}
			for (@Pc(66) int local66 = 0; local66 < arg1; local66++) {
				local23.method1313();
			}
			Static210.aClass26_41.method510(local23, (long) (this.anInt4313 | arg1 << 16 | (arg0 ? 262144 : 0)));
		}
		return local23;
	}
}
