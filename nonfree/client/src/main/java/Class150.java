import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class150 {

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
	public int anInt5036;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
	public int anInt5043;

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "Z")
	public boolean aBoolean439 = false;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!ef;I)V")
	public void method4287(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub12 arg1) {
		while (true) {
			@Pc(14) int local14 = arg1.method3124();
			if (local14 == 0) {
				return;
			}
			this.method4292(arg0, arg1, local14);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Z")
	public boolean method4289() {
		return Static64.aClass104_44.method2755(this.anInt5043);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!ef;II)V")
	private void method4292(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub12 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt5043 = arg1.method3104();
		} else if (arg2 == 2) {
			this.anInt5036 = arg1.method3163();
		} else if (arg2 == 3) {
			this.aBoolean439 = true;
			return;
		} else if (arg2 == 4) {
			this.anInt5043 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZLclient!dr;Z)Lclient!kr;")
	public Class46 method4293(@OriginalArg(0) int arg0, @OriginalArg(2) Class37 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(24) long local24 = (long) (arg1.anInt4312 << 19 | (arg2 ? 262144 : 0) | this.anInt5043 | arg0 << 16);
		@Pc(30) Class46 local30 = (Class46) Static362.aClass107_60.method3021(local24);
		if (local30 != null) {
			return local30;
		} else if (Static64.aClass104_44.method2755(this.anInt5043)) {
			@Pc(48) Class40 local48 = Static368.method843(Static64.aClass104_44, this.anInt5043, 0);
			if (local48 != null) {
				local48.anInt692 = local48.anInt693 = local48.anInt695 = local48.anInt696 = 0;
				if (arg2) {
					local48.method839();
				}
				for (@Pc(68) int local68 = 0; local68 < arg0; local68++) {
					local48.method837();
				}
			}
			local30 = arg1.method3708(local48);
			if (local30 != null) {
				Static362.aClass107_60.method3018(local24, local30);
			}
			return local30;
		} else {
			return null;
		}
	}
}
