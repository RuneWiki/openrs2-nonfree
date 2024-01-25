import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class77 {

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "Lclient!cl;")
	public Class56 aClass56_4;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
	public int anInt1582;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
	public int anInt1586;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "Z")
	public boolean aBoolean125 = false;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZILclient!ha;I)Lclient!hu;")
	public Class44 method1477(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class126 arg1, @OriginalArg(3) int arg2) {
		@Pc(29) long local29 = (long) (arg1.anInt8069 << 19 | (arg0 ? 262144 : 0) | arg2 << 16 | this.anInt1582);
		@Pc(39) Class44 local39 = (Class44) this.aClass56_4.aClass293_8.method6921(local29);
		if (local39 != null) {
			return local39;
		} else if (this.aClass56_4.aClass384_28.method8883(this.anInt1582)) {
			@Pc(61) Class176 local61 = Static654.method4046(this.aClass56_4.aClass384_28, this.anInt1582, 0);
			if (local61 != null) {
				local61.anInt4435 = local61.anInt4434 = local61.anInt4436 = local61.anInt4439 = 0;
				if (arg0) {
					local61.method4045();
				}
				for (@Pc(81) int local81 = 0; local81 < arg2; local81++) {
					local61.method4050();
				}
			}
			local39 = arg1.method6994(local61, true);
			if (local39 != null) {
				this.aClass56_4.aClass293_8.method6925(local29, local39);
			}
			return local39;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!ee;II)V")
	private void method1478(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1582 = arg0.method8631();
		} else if (arg1 == 2) {
			this.anInt1586 = arg0.method8657();
		} else if (arg1 == 3) {
			this.aBoolean125 = true;
		} else if (arg1 == 4) {
			this.anInt1582 = -1;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)Z")
	public boolean method1479() {
		return this.aClass56_4.aClass384_28.method8883(this.anInt1582);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!ee;B)V")
	public void method1481(@OriginalArg(0) Class5_Sub12 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8645();
			if (local13 == 0) {
				return;
			}
			this.method1478(arg0, local13);
		}
	}
}
