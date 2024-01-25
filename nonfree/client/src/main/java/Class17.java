import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class17 {

	@OriginalMember(owner = "client!an", name = "c", descriptor = "I")
	public int anInt639;

	@OriginalMember(owner = "client!an", name = "h", descriptor = "I")
	public int anInt644;

	@OriginalMember(owner = "client!an", name = "j", descriptor = "Lclient!ui;")
	public Class341 aClass341_1;

	@OriginalMember(owner = "client!an", name = "i", descriptor = "Z")
	public boolean aBoolean66 = false;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZIILclient!ha;)Lclient!ufa;")
	public Class4 method605(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(24) long local24 = (long) (arg1 << 16 | this.anInt639 | (arg0 ? 262144 : 0) | arg2.anInt7303 << 19);
		@Pc(32) Class4 local32 = (Class4) this.aClass341_1.aClass94_60.method2960(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass341_1.aClass223_133.method5951(this.anInt639)) {
			@Pc(54) Class331 local54 = Static655.method7892(this.aClass341_1.aClass223_133, this.anInt639, 0);
			if (local54 != null) {
				local54.anInt9651 = local54.anInt9652 = local54.anInt9647 = local54.anInt9649 = 0;
				if (arg0) {
					local54.method7889();
				}
				for (@Pc(74) int local74 = 0; local74 < arg1; local74++) {
					local54.method7894();
				}
			}
			local32 = arg2.method6121(local54, true);
			if (local32 != null) {
				this.aClass341_1.aClass94_60.method2963(local24, local32);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)Z")
	public boolean method606() {
		return this.aClass341_1.aClass223_133.method5951(this.anInt639);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!ji;Z)V")
	public void method607(@OriginalArg(0) Class6_Sub8 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method8246();
			if (local15 == 0) {
				return;
			}
			this.method608(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!ji;BI)V")
	private void method608(@OriginalArg(0) Class6_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt639 = arg0.method8220();
		} else if (arg1 == 2) {
			this.anInt644 = arg0.method8203();
		} else if (arg1 == 3) {
			this.aBoolean66 = true;
		} else if (arg1 == 4) {
			this.anInt639 = -1;
		}
	}
}
