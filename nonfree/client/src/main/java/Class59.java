import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class59 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
	public int anInt1624;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
	public int anInt1625;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "Lclient!dl;")
	public Class51 aClass51_1;

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "Z")
	public boolean aBoolean111 = false;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLclient!fh;)V")
	public void method1324(@OriginalArg(1) Class5_Sub15 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5539();
			if (local13 == 0) {
				return;
			}
			this.method1330(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)Z")
	public boolean method1325() {
		return this.aClass51_1.aClass243_46.method5463(this.anInt1624);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!za;IIZ)Lclient!o;")
	public Class49 method1326(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(24) long local24 = (long) (this.anInt1624 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt7330 << 19);
		@Pc(32) Class49 local32 = (Class49) this.aClass51_1.aClass44_11.method1028(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass51_1.aClass243_46.method5463(this.anInt1624)) {
			@Pc(54) Class214 local54 = Static470.method4672(this.aClass51_1.aClass243_46, this.anInt1624, 0);
			if (local54 != null) {
				local54.anInt5880 = local54.anInt5884 = local54.anInt5883 = local54.anInt5881 = 0;
				if (arg2) {
					local54.method4678();
				}
				for (@Pc(74) int local74 = 0; local74 < arg1; local74++) {
					local54.method4671();
				}
			}
			local32 = arg0.method5871(local54);
			if (local32 != null) {
				this.aClass51_1.aClass44_11.method1017(local24, local32);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!fh;II)V")
	private void method1330(@OriginalArg(0) Class5_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1624 = arg0.method5598();
		} else if (arg1 == 2) {
			this.anInt1625 = arg0.method5541();
		} else if (arg1 == 3) {
			this.aBoolean111 = true;
		} else if (arg1 == 4) {
			this.anInt1624 = -1;
		}
	}
}
