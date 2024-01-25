import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class2_Sub13_Sub16 extends Class2_Sub13 {

	@OriginalMember(owner = "client!ts", name = "t", descriptor = "I")
	public int anInt8406 = 0;

	@OriginalMember(owner = "client!ts", name = "A", descriptor = "I")
	public int anInt8411 = 12800;

	@OriginalMember(owner = "client!ts", name = "C", descriptor = "I")
	public int anInt8413 = 0;

	@OriginalMember(owner = "client!ts", name = "F", descriptor = "Z")
	public boolean aBoolean606 = true;

	@OriginalMember(owner = "client!ts", name = "H", descriptor = "I")
	public int anInt8417 = -1;

	@OriginalMember(owner = "client!ts", name = "K", descriptor = "I")
	public int anInt8419 = -1;

	@OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
	public int anInt8407 = 12800;

	@OriginalMember(owner = "client!ts", name = "v", descriptor = "Ljava/lang/String;")
	public final String aString174;

	@OriginalMember(owner = "client!ts", name = "L", descriptor = "I")
	public final int anInt8420;

	@OriginalMember(owner = "client!ts", name = "N", descriptor = "I")
	public final int anInt8422;

	@OriginalMember(owner = "client!ts", name = "J", descriptor = "Ljava/lang/String;")
	public final String aString175;

	@OriginalMember(owner = "client!ts", name = "u", descriptor = "Lclient!rk;")
	public final Class249 aClass249_65;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class2_Sub13_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt8419 = arg6;
		this.aString174 = arg2;
		this.anInt8420 = arg3;
		this.aBoolean606 = arg5;
		this.anInt8422 = arg0;
		this.anInt8417 = arg4;
		this.aString175 = arg1;
		if (this.anInt8419 == 255) {
			this.anInt8419 = 0;
		}
		this.aClass249_65 = new Class249();
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "([IIIII)Z")
	public boolean method7027(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(22) Class2_Sub14 local22 = (Class2_Sub14) this.aClass249_65.method6527(); local22 != null; local22 = (Class2_Sub14) this.aClass249_65.method6525()) {
			if (local22.method1166(arg3, arg2, arg1)) {
				local22.method1167(arg1, arg3, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[IIB)Z")
	public boolean method7028(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(19) Class2_Sub14 local19 = (Class2_Sub14) this.aClass249_65.method6527(); local19 != null; local19 = (Class2_Sub14) this.aClass249_65.method6525()) {
			if (local19.method1163(arg2, arg0)) {
				local19.method1165(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BII)Z")
	public boolean method7031(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(19) Class2_Sub14 local19 = (Class2_Sub14) this.aClass249_65.method6527(); local19 != null; local19 = (Class2_Sub14) this.aClass249_65.method6525()) {
			if (local19.method1168(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "([IIII)Z")
	public boolean method7033(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(9) Class2_Sub14 local9 = (Class2_Sub14) this.aClass249_65.method6527(); local9 != null; local9 = (Class2_Sub14) this.aClass249_65.method6525()) {
			if (local9.method1168(arg2, arg1)) {
				local9.method1167(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
	public void method7034() {
		this.anInt8411 = 12800;
		this.anInt8413 = 0;
		this.anInt8406 = 0;
		this.anInt8407 = 12800;
		for (@Pc(27) Class2_Sub14 local27 = (Class2_Sub14) this.aClass249_65.method6527(); local27 != null; local27 = (Class2_Sub14) this.aClass249_65.method6525()) {
			if (local27.anInt1223 < this.anInt8411) {
				this.anInt8411 = local27.anInt1223;
			}
			if (this.anInt8407 > local27.anInt1234) {
				this.anInt8407 = local27.anInt1234;
			}
			if (local27.anInt1232 > this.anInt8406) {
				this.anInt8406 = local27.anInt1232;
			}
			if (this.anInt8413 < local27.anInt1229) {
				this.anInt8413 = local27.anInt1229;
			}
		}
	}
}
