import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
	private final int anInt770;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Z")
	private final boolean aBoolean64;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
	private final int anInt779;

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
	private final int anInt772;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
	private final int anInt767;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
	private final int anInt768;

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
	private final int anInt775;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "Z")
	private final boolean aBoolean65;

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
	private final int anInt777;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
	private int anInt769;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(ZLclient!tq;)V")
	public Class3_Sub7(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class285 arg1) {
		if (Static472.aString75.startsWith("win")) {
			this.anInt770 = 1;
		} else if (Static472.aString75.startsWith("mac")) {
			this.anInt770 = 2;
		} else if (Static472.aString75.startsWith("linux")) {
			this.anInt770 = 3;
		} else {
			this.anInt770 = 4;
		}
		if (Static472.aString79.startsWith("amd64") || Static472.aString79.startsWith("x86_64")) {
			this.aBoolean64 = true;
		} else {
			this.aBoolean64 = false;
		}
		if (Static472.aString77.toLowerCase().indexOf("sun") != -1) {
			this.anInt779 = 1;
		} else if (Static472.aString77.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt779 = 2;
		} else if (Static472.aString77.toLowerCase().indexOf("apple") == -1) {
			this.anInt779 = 4;
		} else {
			this.anInt779 = 3;
		}
		@Pc(92) int local92 = 2;
		@Pc(94) int local94 = 0;
		@Pc(100) char local100;
		try {
			while (Static472.aString74.length() > local92) {
				local100 = Static472.aString74.charAt(local92);
				if (local100 < '0' || local100 > '9') {
					break;
				}
				local92++;
				local94 = local94 * 10 + local100 - 48;
			}
		} catch (@Pc(131) Exception local131) {
		}
		this.anInt772 = local94;
		local92 = Static472.aString74.indexOf(46, 2) + 1;
		local94 = 0;
		try {
			while (local92 < Static472.aString74.length()) {
				local100 = Static472.aString74.charAt(local92);
				if (local100 < '0' || local100 > '9') {
					break;
				}
				local94 = local94 * 10 + local100 - 48;
				local92++;
			}
		} catch (@Pc(174) Exception local174) {
		}
		this.anInt767 = local94;
		local94 = 0;
		local92 = Static472.aString74.indexOf(95, 4) + 1;
		try {
			while (Static472.aString74.length() > local92) {
				local100 = Static472.aString74.charAt(local92);
				if (local100 < '0' || local100 > '9') {
					break;
				}
				local94 = local100 + local94 * 10 - 48;
				local92++;
			}
		} catch (@Pc(220) Exception local220) {
		}
		if (this.anInt772 <= 3) {
			this.anInt768 = 0;
		} else {
			this.anInt768 = Static277.anInt5700;
		}
		this.anInt775 = local94;
		if (arg1.aBoolean625) {
			this.aBoolean65 = false;
		} else {
			this.aBoolean65 = true;
		}
		this.anInt777 = Class5_Sub1.lb;
		try {
			this.anInt769 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(261) Throwable local261) {
			this.anInt769 = 0;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLclient!rt;)V")
	public void method793(@OriginalArg(1) Class3_Sub27 arg0) {
		arg0.method7576(2);
		arg0.method7576(this.anInt770);
		arg0.method7576(this.aBoolean64 ? 1 : 0);
		arg0.method7576(this.anInt779);
		arg0.method7576(this.anInt772);
		arg0.method7576(this.anInt767);
		arg0.method7576(this.anInt775);
		arg0.method7576(this.aBoolean65 ? 1 : 0);
		arg0.method7600(this.anInt777, 30364);
		arg0.method7576(this.anInt768);
		arg0.method7611(this.anInt769);
	}
}
