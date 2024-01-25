import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class145 {

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "Lclient!pp;")
	public Class181 aClass181_5;

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
	public int anInt3853;

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
	public int anInt3855;

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "Z")
	public boolean aBoolean284 = false;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)Z")
	public boolean method3539() {
		return this.aClass181_5.aClass71_69.method1560(this.anInt3853);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIZLclient!km;)Lclient!aq;")
	public Class5 method3541(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class82 arg2) {
		@Pc(24) long local24 = (long) (arg2.anInt5188 << 19 | (arg1 ? 262144 : 0) | arg0 << 16 | this.anInt3853);
		@Pc(32) Class5 local32 = (Class5) this.aClass181_5.aClass154_37.method3751(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass181_5.aClass71_69.method1560(this.anInt3853)) {
			@Pc(54) Class224 local54 = Static404.method5304(this.aClass181_5.aClass71_69, this.anInt3853, 0);
			if (local54 != null) {
				local54.anInt6146 = local54.anInt6144 = local54.anInt6143 = local54.anInt6141 = 0;
				if (arg1) {
					local54.method5308();
				}
				for (@Pc(74) int local74 = 0; local74 < arg0; local74++) {
					local54.method5310();
				}
			}
			local32 = arg2.method4514(local54);
			if (local32 != null) {
				this.aClass181_5.aClass154_37.method3745(local24, local32);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!lk;B)V")
	private void method3542(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt3853 = arg1.method4245();
		} else if (arg0 == 2) {
			this.anInt3855 = arg1.method4235();
		} else if (arg0 == 3) {
			this.aBoolean284 = true;
			return;
		} else if (arg0 == 4) {
			this.anInt3853 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!lk;)V")
	public void method3543(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4240();
			if (local5 == 0) {
				return;
			}
			this.method3542(local5, arg0);
		}
	}
}
