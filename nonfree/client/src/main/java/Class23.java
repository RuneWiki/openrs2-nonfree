import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class23 {

	@OriginalMember(owner = "client!av", name = "c", descriptor = "I")
	public int anInt1014;

	@OriginalMember(owner = "client!av", name = "d", descriptor = "I")
	public int anInt1015;

	@OriginalMember(owner = "client!av", name = "f", descriptor = "Lclient!ok;")
	public Class249 aClass249_1;

	@OriginalMember(owner = "client!av", name = "g", descriptor = "Z")
	public boolean aBoolean93 = false;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ILclient!ek;I)V")
	private void method897(@OriginalArg(1) Class4_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1014 = arg0.method7054();
		} else if (arg1 == 2) {
			this.anInt1015 = arg0.method7013();
		} else if (arg1 == 3) {
			this.aBoolean93 = true;
		} else if (arg1 == 4) {
			this.anInt1014 = -1;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)Z")
	public boolean method898() {
		return this.aClass249_1.aClass348_86.method7960(this.anInt1014);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IZILclient!r;)Lclient!f;")
	public Class88 method900(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class7 arg2) {
		@Pc(34) long local34 = (long) ((arg0 ? 262144 : 0) | arg1 << 16 | this.anInt1014 | arg2.anInt10078 << 19);
		@Pc(42) Class88 local42 = (Class88) this.aClass249_1.aClass167_38.method3966(local34);
		if (local42 != null) {
			return local42;
		} else if (this.aClass249_1.aClass348_86.method7960(this.anInt1014)) {
			@Pc(66) Class103 local66 = Static598.method2462(this.aClass249_1.aClass348_86, this.anInt1014, 0);
			if (local66 != null) {
				local66.anInt3040 = local66.anInt3037 = local66.anInt3036 = local66.anInt3038 = 0;
				if (arg0) {
					local66.method2457();
				}
				for (@Pc(86) int local86 = 0; local86 < arg1; local86++) {
					local66.method2453();
				}
			}
			local42 = arg2.method7808(local66, true);
			if (local42 != null) {
				this.aClass249_1.aClass167_38.method3974(local34, local42);
			}
			return local42;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!ek;B)V")
	public void method901(@OriginalArg(0) Class4_Sub13 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method7004();
			if (local14 == 0) {
				return;
			}
			this.method897(arg0, local14);
		}
	}
}
