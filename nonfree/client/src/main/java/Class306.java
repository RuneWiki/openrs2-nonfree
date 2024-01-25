import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class306 {

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "Lclient!oda;")
	public Class237 aClass237_4;

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "I")
	public int anInt9255;

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "I")
	public int anInt9257;

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "Z")
	public boolean aBoolean662 = false;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)Z")
	public boolean method7742() {
		return this.aClass237_4.aClass157_200.method4575(this.anInt9255);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(BILclient!cea;)V")
	private void method7744(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt9255 = arg1.method8326();
		} else if (arg0 == 2) {
			this.anInt9257 = arg1.method8347();
		} else if (arg0 == 3) {
			this.aBoolean662 = true;
			return;
		} else if (arg0 == 4) {
			this.anInt9255 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IZILclient!ha;)Lclient!mi;")
	public Class46 method7745(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class20 arg2) {
		@Pc(29) long local29 = (long) (arg2.anInt8557 << 19 | this.anInt9255 | arg0 << 16 | (arg1 ? 262144 : 0));
		@Pc(37) Class46 local37 = (Class46) this.aClass237_4.aClass169_41.method5002(local29);
		if (local37 != null) {
			return local37;
		} else if (this.aClass237_4.aClass157_200.method4575(this.anInt9255)) {
			@Pc(59) Class296 local59 = Static652.method7583(this.aClass237_4.aClass157_200, this.anInt9255, 0);
			if (local59 != null) {
				local59.anInt9027 = local59.anInt9029 = local59.anInt9025 = local59.anInt9026 = 0;
				if (arg1) {
					local59.method7576();
				}
				for (@Pc(79) int local79 = 0; local79 < arg0; local79++) {
					local59.method7582();
				}
			}
			local37 = arg2.method7294(local59, true);
			if (local37 != null) {
				this.aClass237_4.aClass169_41.method5001(local37, local29);
			}
			return local37;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(BLclient!cea;)V")
	public void method7746(@OriginalArg(1) Class2_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8383();
			if (local9 == 0) {
				return;
			}
			this.method7744(local9, arg0);
		}
	}
}
