import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class3_Sub1_Sub18 extends Class3_Sub1 {

	@OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
	private int anInt2931;

	@OriginalMember(owner = "client!wa", name = "lb", descriptor = "I")
	public int anInt2940;

	@OriginalMember(owner = "client!wa", name = "ab", descriptor = "I")
	private int anInt2935 = 0;

	@OriginalMember(owner = "client!wa", name = "gb", descriptor = "I")
	private int anInt2938 = 128;

	@OriginalMember(owner = "client!wa", name = "fb", descriptor = "I")
	private int anInt2937 = 0;

	@OriginalMember(owner = "client!wa", name = "kb", descriptor = "[I")
	private final int[] anIntArray376 = new int[6];

	@OriginalMember(owner = "client!wa", name = "Z", descriptor = "I")
	public int anInt2934 = -1;

	@OriginalMember(owner = "client!wa", name = "bb", descriptor = "I")
	private int anInt2936 = 0;

	@OriginalMember(owner = "client!wa", name = "ob", descriptor = "[I")
	private final int[] anIntArray377 = new int[6];

	@OriginalMember(owner = "client!wa", name = "nb", descriptor = "I")
	private int anInt2941 = 128;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!m;II)V")
	private void method1934(@OriginalArg(0) Class3_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2931 = arg0.method1603();
		} else if (arg1 == 2) {
			this.anInt2934 = arg0.method1603();
		} else if (arg1 == 4) {
			this.anInt2938 = arg0.method1603();
		} else if (arg1 == 5) {
			this.anInt2941 = arg0.method1603();
		} else if (arg1 == 6) {
			this.anInt2936 = arg0.method1603();
		} else if (arg1 == 7) {
			this.anInt2935 = arg0.method1587();
		} else if (arg1 == 8) {
			this.anInt2937 = arg0.method1587();
		} else if (arg1 >= 40 && arg1 < 50) {
			this.anIntArray377[arg1 - 40] = arg0.method1603();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.anIntArray376[arg1 - 50] = arg0.method1603();
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)Lclient!v;")
	public Class3_Sub1_Sub1_Sub6 method1935(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub1_Sub1_Sub6 local13 = (Class3_Sub1_Sub1_Sub6) Static101.aClass9_24.method282((long) this.anInt2940);
		if (local13 == null) {
			local13 = Static107.method1799(Static43.aClass11_24, this.anInt2931);
			if (local13 == null) {
				return null;
			}
			for (@Pc(27) int local27 = 0; local27 < 6; local27++) {
				if (this.anIntArray377[0] != 0) {
					local13.method1821(this.anIntArray377[local27], this.anIntArray376[local27]);
				}
			}
			local13.method1811();
			local13.method1806(this.anInt2935 + 64, this.anInt2937 + 850, -30, -50, -30, true);
			Static101.aClass9_24.method284(local13, (long) this.anInt2940);
		}
		@Pc(100) Class3_Sub1_Sub1_Sub6 local100;
		if (this.anInt2934 == -1 || arg0 == -1) {
			local100 = local13.method1805(true);
		} else {
			local100 = Static31.method778(this.anInt2934).method1258(local13, arg0);
		}
		if (this.anInt2938 != 128 || this.anInt2941 != 128) {
			local100.method1817(this.anInt2938, this.anInt2941, this.anInt2938);
		}
		if (this.anInt2936 != 0) {
			if (this.anInt2936 == 90) {
				local100.method1813();
			}
			if (this.anInt2936 == 180) {
				local100.method1813();
				local100.method1813();
			}
			if (this.anInt2936 == 270) {
				local100.method1813();
				local100.method1813();
				local100.method1813();
			}
		}
		return local100;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!m;)V")
	public void method1936(@OriginalArg(1) Class3_Sub6 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1587();
			if (local14 == 0) {
				return;
			}
			this.method1934(arg0, local14);
		}
	}
}
