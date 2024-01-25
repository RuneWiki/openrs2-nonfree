import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class158 {

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "Lclient!je;")
	public Class126 aClass126_4;

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
	public int anInt4565;

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
	public int anInt4566;

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "Z")
	public boolean aBoolean310 = false;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!qa;IZI)Lclient!f;")
	public Class80 method3737(@OriginalArg(0) Class109 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(32) long local32 = (long) (arg0.anInt5850 << 19 | this.anInt4566 | arg2 << 16 | (arg1 ? 262144 : 0));
		@Pc(40) Class80 local40 = (Class80) this.aClass126_4.aClass83_31.method1658(local32);
		if (local40 != null) {
			return local40;
		} else if (this.aClass126_4.aClass250_43.method5668(this.anInt4566)) {
			@Pc(62) Class159 local62 = Static459.method3755(this.aClass126_4.aClass250_43, this.anInt4566, 0);
			if (local62 != null) {
				local62.anInt4571 = local62.anInt4568 = local62.anInt4570 = local62.anInt4572 = 0;
				if (arg1) {
					local62.method3745();
				}
				for (@Pc(82) int local82 = 0; local82 < arg2; local82++) {
					local62.method3744();
				}
			}
			local40 = arg0.method4684(local62);
			if (local40 != null) {
				this.aClass126_4.aClass83_31.method1675(local32, local40);
			}
			return local40;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!lh;I)V")
	public void method3738(@OriginalArg(0) Class1_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4130();
			if (local5 == 0) {
				return;
			}
			this.method3740(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)Z")
	public boolean method3739() {
		return this.aClass126_4.aClass250_43.method5668(this.anInt4566);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!lh;II)V")
	private void method3740(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4566 = arg0.method4093();
		} else if (arg1 == 2) {
			this.anInt4565 = arg0.method4142();
		} else if (arg1 == 3) {
			this.aBoolean310 = true;
		} else if (arg1 == 4) {
			this.anInt4566 = -1;
			return;
		}
	}
}
