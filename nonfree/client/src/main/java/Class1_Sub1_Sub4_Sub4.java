import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class1_Sub1_Sub4_Sub4 extends Class1_Sub1_Sub4 {

	@OriginalMember(owner = "client!fe", name = "hb", descriptor = "I")
	private final int anInt1707;

	@OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
	private final int anInt1699;

	@OriginalMember(owner = "client!fe", name = "fb", descriptor = "I")
	private final int anInt1706;

	@OriginalMember(owner = "client!fe", name = "cb", descriptor = "I")
	private final int anInt1704;

	@OriginalMember(owner = "client!fe", name = "bb", descriptor = "I")
	private final int anInt1703;

	@OriginalMember(owner = "client!fe", name = "jb", descriptor = "I")
	private final int anInt1708;

	@OriginalMember(owner = "client!fe", name = "ab", descriptor = "Lclient!re;")
	private Class1_Sub1_Sub17 aClass1_Sub1_Sub17_1;

	@OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
	private int anInt1698;

	@OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
	private int anInt1697;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IIIIIIIZLclient!s;)V")
	public Class1_Sub1_Sub4_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class1_Sub1_Sub4 arg8) {
		this.anInt1707 = arg4;
		this.anInt1699 = arg3;
		this.anInt1706 = arg5;
		this.anInt1704 = arg0;
		this.anInt1703 = arg1;
		this.anInt1708 = arg2;
		if (arg6 != -1) {
			this.aClass1_Sub1_Sub17_1 = Static90.method1962(arg6);
			this.anInt1698 = 0;
			this.anInt1697 = Static47.anInt1654 - 1;
			if (this.aClass1_Sub1_Sub17_1.anInt3856 == 0 && arg8 != null && arg8 instanceof Class1_Sub1_Sub4_Sub4) {
				@Pc(50) Class1_Sub1_Sub4_Sub4 local50 = (Class1_Sub1_Sub4_Sub4) arg8;
				if (local50.aClass1_Sub1_Sub17_1 == this.aClass1_Sub1_Sub17_1) {
					this.anInt1698 = local50.anInt1698;
					this.anInt1697 = local50.anInt1697;
					return;
				}
			}
			if (arg7 && this.aClass1_Sub1_Sub17_1.anInt3869 != -1) {
				this.anInt1698 = (int) (Math.random() * (double) this.aClass1_Sub1_Sub17_1.anIntArray365.length);
				this.anInt1697 -= (int) ((double) this.aClass1_Sub1_Sub17_1.anIntArray370[this.anInt1698] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)Lclient!je;")
	@Override
	protected Class1_Sub1_Sub4_Sub1 method3066() {
		if (this.aClass1_Sub1_Sub17_1 != null) {
			@Pc(14) int local14 = Static47.anInt1654 - this.anInt1697;
			if (local14 > 100 && this.aClass1_Sub1_Sub17_1.anInt3869 > 0) {
				local14 = 100;
			}
			label46: {
				do {
					do {
						if (this.aClass1_Sub1_Sub17_1.anIntArray370[this.anInt1698] >= local14) {
							break label46;
						}
						local14 -= this.aClass1_Sub1_Sub17_1.anIntArray370[this.anInt1698];
						this.anInt1698++;
					} while (this.aClass1_Sub1_Sub17_1.anIntArray365.length > this.anInt1698);
					this.anInt1698 -= this.aClass1_Sub1_Sub17_1.anInt3869;
				} while (this.anInt1698 >= 0 && this.anInt1698 < this.aClass1_Sub1_Sub17_1.anIntArray365.length);
				this.aClass1_Sub1_Sub17_1 = null;
			}
			this.anInt1697 = Static47.anInt1654 - local14;
		}
		@Pc(97) Class1_Sub1_Sub7 local97 = Static176.method3433(this.anInt1704);
		if (local97.anIntArray186 != null) {
			local97 = local97.method1395();
		}
		if (local97 == null) {
			return null;
		}
		@Pc(121) int local121;
		@Pc(124) int local124;
		if (this.anInt1708 == 1 || this.anInt1708 == 3) {
			local124 = local97.anInt1818;
			local121 = local97.anInt1813;
		} else {
			local121 = local97.anInt1818;
			local124 = local97.anInt1813;
		}
		@Pc(141) int local141 = (local121 + 1 >> 1) + this.anInt1707;
		@Pc(149) int local149 = this.anInt1707 + (local121 >> 1);
		@Pc(154) int[][] local154 = Static142.anIntArrayArrayArray8[this.anInt1699];
		@Pc(163) int local163 = (local124 + 1 >> 1) + this.anInt1706;
		@Pc(170) int local170 = this.anInt1706 + (local124 >> 1);
		@Pc(197) int local197 = local154[local149][local163] + local154[local141][local170] + local154[local149][local170] + local154[local141][local163] >> 2;
		@Pc(206) int local206 = (local121 << 6) + (this.anInt1707 << 7);
		@Pc(216) int local216 = (this.anInt1706 << 7) + (local124 << 6);
		return local97.method1399(local197, local206, this.aClass1_Sub1_Sub17_1, this.anInt1708, local154, this.anInt1698, local216, this.anInt1703);
	}
}
