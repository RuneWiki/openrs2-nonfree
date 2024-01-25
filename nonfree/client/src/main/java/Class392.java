import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class392 {

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "Lclient!iba;")
	public Class161 aClass161_4;

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
	public int anInt10401;

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
	public int anInt10405;

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "Z")
	public boolean aBoolean767 = false;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILclient!rv;)V")
	public void method8678(@OriginalArg(1) Class5_Sub15 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method3642();
			if (local12 == 0) {
				return;
			}
			this.method8679(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILclient!rv;)V")
	private void method8679(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt10405 = arg1.method3698();
		} else if (arg0 == 2) {
			this.anInt10401 = arg1.method3633();
		} else if (arg0 == 3) {
			this.aBoolean767 = true;
		} else if (arg0 == 4) {
			this.anInt10405 = -1;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)Z")
	public boolean method8681() {
		return this.aClass161_4.aClass50_63.method897(this.anInt10405);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIZLclient!ha;)Lclient!qda;")
	public Class59 method8682(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class143 arg2) {
		@Pc(22) long local22 = (long) (arg0 << 16 | this.anInt10405 | (arg1 ? 262144 : 0) | arg2.anInt7197 << 19);
		@Pc(30) Class59 local30 = (Class59) this.aClass161_4.aClass265_23.method6577(local22);
		if (local30 != null) {
			return local30;
		} else if (this.aClass161_4.aClass50_63.method897(this.anInt10405)) {
			@Pc(54) Class301 local54 = Static684.method7228(this.aClass161_4.aClass50_63, this.anInt10405, 0);
			if (local54 != null) {
				local54.anInt8496 = local54.anInt8500 = local54.anInt8498 = local54.anInt8499 = 0;
				if (arg1) {
					local54.method7223();
				}
				for (@Pc(74) int local74 = 0; local74 < arg0; local74++) {
					local54.method7225();
				}
			}
			local30 = arg2.method6247(local54, true);
			if (local30 != null) {
				this.aClass161_4.aClass265_23.method6566(local30, local22);
			}
			return local30;
		} else {
			return null;
		}
	}
}
