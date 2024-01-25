import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class5_Sub49 extends Class5 {

	@OriginalMember(owner = "client!vca", name = "w", descriptor = "I")
	private final int anInt8647;

	@OriginalMember(owner = "client!vca", name = "v", descriptor = "Z")
	private final boolean aBoolean627;

	@OriginalMember(owner = "client!vca", name = "u", descriptor = "I")
	private final int anInt8646;

	@OriginalMember(owner = "client!vca", name = "m", descriptor = "I")
	private final int anInt8641;

	@OriginalMember(owner = "client!vca", name = "l", descriptor = "I")
	private final int anInt8640;

	@OriginalMember(owner = "client!vca", name = "q", descriptor = "I")
	private final int anInt8645;

	@OriginalMember(owner = "client!vca", name = "s", descriptor = "Z")
	private final boolean aBoolean626;

	@OriginalMember(owner = "client!vca", name = "o", descriptor = "I")
	private final int anInt8643;

	@OriginalMember(owner = "client!vca", name = "k", descriptor = "I")
	private final int anInt8639;

	@OriginalMember(owner = "client!vca", name = "y", descriptor = "I")
	private int anInt8649;

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(ZLclient!ae;)V")
	public Class5_Sub49(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class9 arg1) {
		if (Static9.aString8.startsWith("win")) {
			this.anInt8647 = 1;
		} else if (Static9.aString8.startsWith("mac")) {
			this.anInt8647 = 2;
		} else if (Static9.aString8.startsWith("linux")) {
			this.anInt8647 = 3;
		} else {
			this.anInt8647 = 4;
		}
		if (Static9.aString6.startsWith("amd64") || Static9.aString6.startsWith("x86_64")) {
			this.aBoolean627 = true;
		} else {
			this.aBoolean627 = false;
		}
		if (Static9.aString5.toLowerCase().indexOf("sun") != -1) {
			this.anInt8646 = 1;
		} else if (Static9.aString5.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt8646 = 2;
		} else if (Static9.aString5.toLowerCase().indexOf("apple") == -1) {
			this.anInt8646 = 4;
		} else {
			this.anInt8646 = 3;
		}
		@Pc(92) int local92 = 2;
		@Pc(94) int local94 = 0;
		@Pc(100) char local100;
		try {
			while (Static9.aString7.length() > local92) {
				local100 = Static9.aString7.charAt(local92);
				if (local100 < '0' || local100 > '9') {
					break;
				}
				local94 = local94 * 10 + local100 - 48;
				local92++;
			}
		} catch (@Pc(127) Exception local127) {
		}
		this.anInt8641 = local94;
		local94 = 0;
		local92 = Static9.aString7.indexOf(46, 2) + 1;
		try {
			while (Static9.aString7.length() > local92) {
				local100 = Static9.aString7.charAt(local92);
				if (local100 < '0' || local100 > '9') {
					break;
				}
				local94 = local94 * 10 + local100 - 48;
				local92++;
			}
		} catch (@Pc(177) Exception local177) {
		}
		this.anInt8640 = local94;
		local92 = Static9.aString7.indexOf(95, 4) + 1;
		local94 = 0;
		try {
			while (local92 < Static9.aString7.length()) {
				local100 = Static9.aString7.charAt(local92);
				if (local100 < '0' || local100 > '9') {
					break;
				}
				local94 = local94 * 10 + local100 - 48;
				local92++;
			}
		} catch (@Pc(218) Exception local218) {
		}
		this.anInt8645 = Static193.anInt3735;
		if (Static9.anInt148 == 3) {
			this.aBoolean626 = true;
		} else {
			this.aBoolean626 = false;
		}
		if (this.anInt8641 > 3) {
			this.anInt8643 = Static397.anInt7131;
		} else {
			this.anInt8643 = 0;
		}
		this.anInt8639 = local94;
		try {
			this.anInt8649 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(259) Throwable local259) {
			this.anInt8649 = 0;
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ILclient!co;)V")
	public void method6988(@OriginalArg(1) Class5_Sub3 arg0) {
		arg0.method4192(2);
		arg0.method4192(this.anInt8647);
		arg0.method4192(this.aBoolean627 ? 1 : 0);
		arg0.method4192(this.anInt8646);
		arg0.method4192(this.anInt8641);
		arg0.method4192(this.anInt8640);
		arg0.method4192(this.anInt8639);
		arg0.method4192(this.aBoolean626 ? 1 : 0);
		arg0.method4181(this.anInt8645);
		arg0.method4192(this.anInt8643);
		arg0.method4197(this.anInt8649);
	}
}
