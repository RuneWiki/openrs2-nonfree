import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!hd", name = "ub", descriptor = "I")
	private final int anInt1352;

	@OriginalMember(owner = "client!hd", name = "Gb", descriptor = "I")
	private final int anInt1361;

	@OriginalMember(owner = "client!hd", name = "wb", descriptor = "I")
	private final int anInt1353;

	@OriginalMember(owner = "client!hd", name = "Ab", descriptor = "I")
	private final int anInt1355;

	@OriginalMember(owner = "client!hd", name = "Hb", descriptor = "I")
	private final int anInt1362;

	@OriginalMember(owner = "client!hd", name = "Cb", descriptor = "I")
	private final int anInt1357;

	@OriginalMember(owner = "client!hd", name = "Bb", descriptor = "I")
	private final int anInt1356;

	@OriginalMember(owner = "client!hd", name = "tb", descriptor = "Lclient!f;")
	private Class1_Sub1_Sub7 aClass1_Sub1_Sub7_2;

	@OriginalMember(owner = "client!hd", name = "Mb", descriptor = "I")
	private int anInt1366;

	@OriginalMember(owner = "client!hd", name = "Nb", descriptor = "I")
	private int anInt1367;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIIIIZLclient!cc;)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class1_Sub1_Sub2 arg9) {
		this.anInt1352 = arg6;
		this.anInt1361 = arg5;
		this.anInt1353 = arg2;
		this.anInt1355 = arg1;
		this.anInt1362 = arg3;
		this.anInt1357 = arg4;
		this.anInt1356 = arg0;
		if (arg7 != -1) {
			this.aClass1_Sub1_Sub7_2 = Static82.method1398(arg7);
			this.anInt1366 = Static45.anInt1256 - 1;
			this.anInt1367 = 0;
			if (this.aClass1_Sub1_Sub7_2.anInt1049 == 0 && arg9 != null && arg9 instanceof Class1_Sub1_Sub2_Sub4) {
				@Pc(53) Class1_Sub1_Sub2_Sub4 local53 = (Class1_Sub1_Sub2_Sub4) arg9;
				if (this.aClass1_Sub1_Sub7_2 == local53.aClass1_Sub1_Sub7_2) {
					this.anInt1367 = local53.anInt1367;
					this.anInt1366 = local53.anInt1366;
					return;
				}
			}
			if (arg8 && this.aClass1_Sub1_Sub7_2.anInt1047 != -1) {
				this.anInt1367 = (int) (Math.random() * (double) this.aClass1_Sub1_Sub7_2.anIntArray151.length);
				this.anInt1366 -= (int) ((double) this.aClass1_Sub1_Sub7_2.anIntArray149[this.anInt1367] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)Lclient!na;")
	@Override
	public Class1_Sub1_Sub2_Sub7 method1790() {
		if (this.aClass1_Sub1_Sub7_2 != null) {
			@Pc(10) int local10 = Static45.anInt1256 - this.anInt1366;
			if (local10 > 100 && this.aClass1_Sub1_Sub7_2.anInt1047 > 0) {
				local10 = 100;
			}
			label37: {
				do {
					do {
						if (local10 <= this.aClass1_Sub1_Sub7_2.anIntArray149[this.anInt1367]) {
							break label37;
						}
						local10 -= this.aClass1_Sub1_Sub7_2.anIntArray149[this.anInt1367];
						this.anInt1367++;
					} while (this.aClass1_Sub1_Sub7_2.anIntArray151.length > this.anInt1367);
					this.anInt1367 -= this.aClass1_Sub1_Sub7_2.anInt1047;
				} while (this.anInt1367 >= 0 && this.aClass1_Sub1_Sub7_2.anIntArray151.length > this.anInt1367);
				this.aClass1_Sub1_Sub7_2 = null;
			}
			this.anInt1366 = Static45.anInt1256 - local10;
		}
		@Pc(108) Class1_Sub1_Sub18 local108 = Static104.method1862(this.anInt1356);
		if (local108.anIntArray477 != null) {
			local108 = local108.method2126();
		}
		return local108 == null ? null : local108.method2125(this.anInt1361, this.anInt1362, this.anInt1357, this.anInt1353, this.anInt1355, this.aClass1_Sub1_Sub7_2, this.anInt1352, this.anInt1367);
	}
}
