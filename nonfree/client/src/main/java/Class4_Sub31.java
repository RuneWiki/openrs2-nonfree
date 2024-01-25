import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class4_Sub31 extends Class4 {

	@OriginalMember(owner = "client!os", name = "t", descriptor = "I")
	private final int anInt5423;

	@OriginalMember(owner = "client!os", name = "z", descriptor = "Z")
	private final boolean aBoolean390;

	@OriginalMember(owner = "client!os", name = "F", descriptor = "I")
	private final int anInt5431;

	@OriginalMember(owner = "client!os", name = "v", descriptor = "I")
	private final int anInt5425;

	@OriginalMember(owner = "client!os", name = "r", descriptor = "I")
	private final int anInt5421;

	@OriginalMember(owner = "client!os", name = "o", descriptor = "I")
	private final int anInt5419;

	@OriginalMember(owner = "client!os", name = "s", descriptor = "I")
	private final int anInt5422;

	@OriginalMember(owner = "client!os", name = "q", descriptor = "Z")
	private final boolean aBoolean389;

	@OriginalMember(owner = "client!os", name = "p", descriptor = "I")
	private int anInt5420;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
	public Class4_Sub31() {
		if (Static419.aString74.startsWith("win")) {
			this.anInt5423 = 1;
		} else if (Static419.aString74.startsWith("mac")) {
			this.anInt5423 = 2;
		} else if (Static419.aString74.startsWith("linux")) {
			this.anInt5423 = 3;
		} else {
			this.anInt5423 = 4;
		}
		if (Static419.aString71.startsWith("amd64") || Static419.aString71.startsWith("x86_64")) {
			this.aBoolean390 = true;
		} else {
			this.aBoolean390 = false;
		}
		if (Static419.aString69.toLowerCase().indexOf("sun") != -1) {
			this.anInt5431 = 1;
		} else if (Static419.aString69.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt5431 = 2;
		} else if (Static419.aString69.toLowerCase().indexOf("apple") == -1) {
			this.anInt5431 = 4;
		} else {
			this.anInt5431 = 3;
		}
		@Pc(88) int local88 = 2;
		@Pc(90) int local90 = 0;
		@Pc(96) char local96;
		try {
			while (local88 < Static419.aString72.length()) {
				local96 = Static419.aString72.charAt(local88);
				if (local96 < '0' || local96 > '9') {
					break;
				}
				local90 = local90 * 10 + local96 - 48;
				local88++;
			}
		} catch (@Pc(122) Exception local122) {
		}
		this.anInt5425 = local90;
		local88 = Static419.aString72.indexOf(46, 2);
		local90 = 0;
		try {
			while (local88 < Static419.aString72.length()) {
				local96 = Static419.aString72.charAt(local88);
				if (local96 < '0' || local96 > '9') {
					break;
				}
				local88++;
				local90 = local90 * 10 + local96 - 48;
			}
		} catch (@Pc(168) Exception local168) {
		}
		if (this.anInt5425 <= 3) {
			this.anInt5421 = 0;
		} else {
			this.anInt5421 = Static65.anInt1627;
		}
		this.anInt5419 = Static263.anInt5007;
		this.anInt5422 = local90;
		if (Static419.anInt7272 == 3) {
			this.aBoolean389 = true;
		} else {
			this.aBoolean389 = false;
		}
		try {
			this.anInt5420 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(207) Throwable local207) {
			this.anInt5420 = 0;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!wn;I)V")
	public void method4508(@OriginalArg(0) Class4_Sub20 arg0) {
		arg0.method4590(1);
		arg0.method4590(this.anInt5423);
		arg0.method4590(this.aBoolean390 ? 1 : 0);
		arg0.method4590(this.anInt5431);
		arg0.method4590(this.anInt5425);
		arg0.method4590(this.anInt5422);
		arg0.method4590(this.aBoolean389 ? 1 : 0);
		arg0.method4558(this.anInt5419);
		arg0.method4590(this.anInt5421);
		arg0.method4598(this.anInt5420);
	}
}
