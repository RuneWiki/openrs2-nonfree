import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sfa")
public final class Class1_Sub3_Sub17 extends Class1_Sub3 {

	@OriginalMember(owner = "client!sfa", name = "x", descriptor = "I")
	public int anInt8089 = 12800;

	@OriginalMember(owner = "client!sfa", name = "C", descriptor = "Z")
	public boolean aBoolean578 = true;

	@OriginalMember(owner = "client!sfa", name = "P", descriptor = "I")
	public int anInt8100 = 0;

	@OriginalMember(owner = "client!sfa", name = "M", descriptor = "I")
	public int anInt8098 = -1;

	@OriginalMember(owner = "client!sfa", name = "G", descriptor = "I")
	public int anInt8095 = 0;

	@OriginalMember(owner = "client!sfa", name = "E", descriptor = "I")
	public int anInt8093 = -1;

	@OriginalMember(owner = "client!sfa", name = "H", descriptor = "I")
	public int anInt8096 = 12800;

	@OriginalMember(owner = "client!sfa", name = "I", descriptor = "Ljava/lang/String;")
	public final String aString85;

	@OriginalMember(owner = "client!sfa", name = "z", descriptor = "I")
	public final int anInt8091;

	@OriginalMember(owner = "client!sfa", name = "A", descriptor = "I")
	public final int anInt8092;

	@OriginalMember(owner = "client!sfa", name = "D", descriptor = "Ljava/lang/String;")
	public final String aString84;

	@OriginalMember(owner = "client!sfa", name = "R", descriptor = "Lclient!wo;")
	public final Class361 aClass361_91;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class1_Sub3_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString85 = arg2;
		this.anInt8098 = arg4;
		this.anInt8091 = arg3;
		this.anInt8092 = arg0;
		this.aBoolean578 = arg5;
		this.aString84 = arg1;
		this.anInt8093 = arg6;
		if (this.anInt8093 == 255) {
			this.anInt8093 = 0;
		}
		this.aClass361_91 = new Class361();
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(II[II)Z")
	public boolean method6735(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(20) Class1_Sub42 local20 = (Class1_Sub42) this.aClass361_91.method7854(); local20 != null; local20 = (Class1_Sub42) this.aClass361_91.method7853()) {
			if (local20.method6592(arg0, arg2)) {
				local20.method6595(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I[IIIB)Z")
	public boolean method6737(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(16) Class1_Sub42 local16 = (Class1_Sub42) this.aClass361_91.method7854(); local16 != null; local16 = (Class1_Sub42) this.aClass361_91.method7853()) {
			if (local16.method6594(arg3, arg0, arg2)) {
				local16.method6591(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "([IZII)Z")
	public boolean method6738(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(16) Class1_Sub42 local16 = (Class1_Sub42) this.aClass361_91.method7854(); local16 != null; local16 = (Class1_Sub42) this.aClass361_91.method7853()) {
			if (local16.method6593(arg2, arg1)) {
				local16.method6591(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sfa", name = "d", descriptor = "(I)V")
	public void method6739() {
		this.anInt8100 = 0;
		this.anInt8089 = 12800;
		this.anInt8095 = 0;
		this.anInt8096 = 12800;
		for (@Pc(23) Class1_Sub42 local23 = (Class1_Sub42) this.aClass361_91.method7854(); local23 != null; local23 = (Class1_Sub42) this.aClass361_91.method7853()) {
			if (this.anInt8095 < local23.anInt7909) {
				this.anInt8095 = local23.anInt7909;
			}
			if (this.anInt8089 > local23.anInt7915) {
				this.anInt8089 = local23.anInt7915;
			}
			if (this.anInt8096 > local23.anInt7912) {
				this.anInt8096 = local23.anInt7912;
			}
			if (local23.anInt7907 > this.anInt8100) {
				this.anInt8100 = local23.anInt7907;
			}
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IIZ)Z")
	public boolean method6740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(16) Class1_Sub42 local16 = (Class1_Sub42) this.aClass361_91.method7854(); local16 != null; local16 = (Class1_Sub42) this.aClass361_91.method7853()) {
			if (local16.method6593(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}
}
