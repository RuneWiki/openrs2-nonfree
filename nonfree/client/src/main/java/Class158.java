import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class158 {

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
	public int anInt4581;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "Lclient!rf;")
	public Class274 aClass274_4;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
	public int anInt4582;

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "Z")
	public boolean aBoolean337 = false;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZLclient!oa;ZI)Lclient!xa;")
	public Class71 method3894(@OriginalArg(1) Class90 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(24) long local24 = (long) (arg0.anInt9369 << 19 | (arg1 ? 262144 : 0) | this.anInt4581 | arg2 << 16);
		@Pc(32) Class71 local32 = (Class71) this.aClass274_4.aClass330_56.method7677(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass274_4.aClass248_86.method5804(this.anInt4581)) {
			@Pc(59) Class177 local59 = Static593.method4148(this.aClass274_4.aClass248_86, this.anInt4581, 0);
			if (local59 != null) {
				local59.anInt4888 = local59.anInt4886 = local59.anInt4889 = local59.anInt4885 = 0;
				if (arg1) {
					local59.method4138();
				}
				for (@Pc(79) int local79 = 0; local79 < arg2; local79++) {
					local59.method4145();
				}
			}
			local32 = arg0.method7522(local59);
			if (local32 != null) {
				this.aClass274_4.aClass330_56.method7676(local32, local24);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!jr;I)V")
	public void method3896(@OriginalArg(0) Class6_Sub12 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method6019();
			if (local7 == 0) {
				return;
			}
			this.method3898(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!jr;I)V")
	private void method3898(@OriginalArg(1) Class6_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4581 = arg0.method6044();
		} else if (arg1 == 2) {
			this.anInt4582 = arg0.method6037();
			return;
		} else if (arg1 == 3) {
			this.aBoolean337 = true;
			return;
		} else if (arg1 == 4) {
			this.anInt4581 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)Z")
	public boolean method3899() {
		return this.aClass274_4.aClass248_86.method5804(this.anInt4581);
	}
}
