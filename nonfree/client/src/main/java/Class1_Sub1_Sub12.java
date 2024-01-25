import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lo", name = "r", descriptor = "Z")
	public boolean aBoolean385 = true;

	@OriginalMember(owner = "client!lo", name = "D", descriptor = "I")
	public int anInt5572 = -1;

	@OriginalMember(owner = "client!lo", name = "y", descriptor = "I")
	public int anInt5570 = 0;

	@OriginalMember(owner = "client!lo", name = "H", descriptor = "I")
	public int anInt5575 = 12800;

	@OriginalMember(owner = "client!lo", name = "G", descriptor = "I")
	public int anInt5574 = 12800;

	@OriginalMember(owner = "client!lo", name = "K", descriptor = "I")
	public int anInt5578 = -1;

	@OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
	public int anInt5577 = 0;

	@OriginalMember(owner = "client!lo", name = "t", descriptor = "Ljava/lang/String;")
	public final String aString44;

	@OriginalMember(owner = "client!lo", name = "u", descriptor = "Ljava/lang/String;")
	public final String aString45;

	@OriginalMember(owner = "client!lo", name = "v", descriptor = "I")
	public final int anInt5567;

	@OriginalMember(owner = "client!lo", name = "x", descriptor = "I")
	public final int anInt5569;

	@OriginalMember(owner = "client!lo", name = "z", descriptor = "Lclient!bu;")
	public final Class38 aClass38_40;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class1_Sub1_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString44 = arg2;
		this.aBoolean385 = arg5;
		this.anInt5578 = arg6;
		this.aString45 = arg1;
		this.anInt5572 = arg4;
		this.anInt5567 = arg0;
		this.anInt5569 = arg3;
		if (this.anInt5578 == 255) {
			this.anInt5578 = 0;
		}
		this.aClass38_40 = new Class38();
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II[II)Z")
	public boolean method4787(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(15) Class1_Sub35 local15 = (Class1_Sub35) this.aClass38_40.method1419(); local15 != null; local15 = (Class1_Sub35) this.aClass38_40.method1415()) {
			if (local15.method5647(arg0, arg2)) {
				local15.method5649(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BI[II)Z")
	public boolean method4788(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(17) Class1_Sub35 local17 = (Class1_Sub35) this.aClass38_40.method1419(); local17 != null; local17 = (Class1_Sub35) this.aClass38_40.method1415()) {
			if (local17.method5651(arg0, arg2)) {
				local17.method5645(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IZI)Z")
	public boolean method4789(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(19) Class1_Sub35 local19 = (Class1_Sub35) this.aClass38_40.method1419(); local19 != null; local19 = (Class1_Sub35) this.aClass38_40.method1415()) {
			if (local19.method5647(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BII[II)Z")
	public boolean method4790(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(9) Class1_Sub35 local9 = (Class1_Sub35) this.aClass38_40.method1419(); local9 != null; local9 = (Class1_Sub35) this.aClass38_40.method1415()) {
			if (local9.method5646(arg0, arg1, arg3)) {
				local9.method5649(arg3, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
	public void method4791() {
		this.anInt5574 = 12800;
		this.anInt5575 = 12800;
		this.anInt5570 = 0;
		this.anInt5577 = 0;
		for (@Pc(21) Class1_Sub35 local21 = (Class1_Sub35) this.aClass38_40.method1419(); local21 != null; local21 = (Class1_Sub35) this.aClass38_40.method1415()) {
			if (this.anInt5575 > local21.anInt6507) {
				this.anInt5575 = local21.anInt6507;
			}
			if (local21.anInt6502 > this.anInt5577) {
				this.anInt5577 = local21.anInt6502;
			}
			if (local21.anInt6512 < this.anInt5574) {
				this.anInt5574 = local21.anInt6512;
			}
			if (this.anInt5570 < local21.anInt6509) {
				this.anInt5570 = local21.anInt6509;
			}
		}
	}
}
