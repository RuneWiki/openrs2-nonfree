import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class125 {

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "Lclient!nv;")
	public Class176 aClass176_2;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
	public int anInt3459;

	@OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
	public int anInt3466;

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "Z")
	public boolean aBoolean209 = false;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZBLclient!ya;I)Lclient!l;")
	public Class11 method2811(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class51 arg1, @OriginalArg(3) int arg2) {
		@Pc(24) long local24 = (long) (this.anInt3466 | arg2 << 16 | (arg0 ? 262144 : 0) | arg1.anInt6714 << 19);
		@Pc(32) Class11 local32 = (Class11) this.aClass176_2.aClass126_41.method2822(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass176_2.aClass178_84.method3848(this.anInt3466)) {
			@Pc(60) Class246 local60 = Static469.method5145(this.aClass176_2.aClass178_84, this.anInt3466, 0);
			if (local60 != null) {
				local60.anInt6477 = local60.anInt6473 = local60.anInt6474 = local60.anInt6478 = 0;
				if (arg0) {
					local60.method5136();
				}
				for (@Pc(80) int local80 = 0; local80 < arg2; local80++) {
					local60.method5142();
				}
			}
			local32 = arg1.method5308(local60);
			if (local32 != null) {
				this.aClass176_2.aClass126_41.method2824(local24, local32);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)Z")
	public boolean method2813() {
		return this.aClass176_2.aClass178_84.method3848(this.anInt3466);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLclient!gk;)V")
	public void method2814(@OriginalArg(1) Class7_Sub14 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3981();
			if (local11 == 0) {
				return;
			}
			this.method2815(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!gk;I)V")
	private void method2815(@OriginalArg(1) Class7_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3466 = arg0.method3943();
		} else if (arg1 == 2) {
			this.anInt3459 = arg0.method3975();
		} else if (arg1 == 3) {
			this.aBoolean209 = true;
		} else if (arg1 == 4) {
			this.anInt3466 = -1;
		}
	}
}
