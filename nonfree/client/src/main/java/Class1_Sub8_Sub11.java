import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qea")
public final class Class1_Sub8_Sub11 extends Class1_Sub8 {

	@OriginalMember(owner = "client!qea", name = "A", descriptor = "I")
	public int anInt7418 = 12800;

	@OriginalMember(owner = "client!qea", name = "E", descriptor = "Z")
	public boolean aBoolean572 = true;

	@OriginalMember(owner = "client!qea", name = "y", descriptor = "I")
	public int anInt7416 = 0;

	@OriginalMember(owner = "client!qea", name = "G", descriptor = "I")
	public int anInt7423 = -1;

	@OriginalMember(owner = "client!qea", name = "Q", descriptor = "I")
	public int anInt7429 = 12800;

	@OriginalMember(owner = "client!qea", name = "B", descriptor = "I")
	public int anInt7419 = -1;

	@OriginalMember(owner = "client!qea", name = "H", descriptor = "I")
	public int anInt7424 = 0;

	@OriginalMember(owner = "client!qea", name = "D", descriptor = "I")
	public final int anInt7421;

	@OriginalMember(owner = "client!qea", name = "O", descriptor = "Ljava/lang/String;")
	public final String aString85;

	@OriginalMember(owner = "client!qea", name = "M", descriptor = "I")
	public final int anInt7427;

	@OriginalMember(owner = "client!qea", name = "L", descriptor = "Ljava/lang/String;")
	public final String aString84;

	@OriginalMember(owner = "client!qea", name = "P", descriptor = "Lclient!gca;")
	public final Class111 aClass111_47;

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class1_Sub8_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt7419 = arg4;
		this.anInt7421 = arg0;
		this.aBoolean572 = arg5;
		this.aString85 = arg2;
		this.anInt7427 = arg3;
		this.aString84 = arg1;
		this.anInt7423 = arg6;
		if (this.anInt7423 == 255) {
			this.anInt7423 = 0;
		}
		this.aClass111_47 = new Class111();
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)V")
	public void method5975() {
		this.anInt7418 = 12800;
		this.anInt7416 = 0;
		this.anInt7424 = 0;
		this.anInt7429 = 12800;
		for (@Pc(31) Class1_Sub17 local31 = (Class1_Sub17) this.aClass111_47.method2547(); local31 != null; local31 = (Class1_Sub17) this.aClass111_47.method2554()) {
			if (local31.anInt1720 < this.anInt7418) {
				this.anInt7418 = local31.anInt1720;
			}
			if (this.anInt7416 < local31.anInt1710) {
				this.anInt7416 = local31.anInt1710;
			}
			if (local31.anInt1719 > this.anInt7424) {
				this.anInt7424 = local31.anInt1719;
			}
			if (local31.anInt1704 < this.anInt7429) {
				this.anInt7429 = local31.anInt1704;
			}
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "([IIII)Z")
	public boolean method5977(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(16) Class1_Sub17 local16 = (Class1_Sub17) this.aClass111_47.method2547(); local16 != null; local16 = (Class1_Sub17) this.aClass111_47.method2554()) {
			if (local16.method1443(arg1, arg2)) {
				local16.method1447(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "([IIIZ)Z")
	public boolean method5978(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) Class1_Sub17 local11 = (Class1_Sub17) this.aClass111_47.method2547(); local11 != null; local11 = (Class1_Sub17) this.aClass111_47.method2554()) {
			if (local11.method1444(arg1, arg2)) {
				local11.method1445(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(III)Z")
	public boolean method5980(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class1_Sub17 local11 = (Class1_Sub17) this.aClass111_47.method2547(); local11 != null; local11 = (Class1_Sub17) this.aClass111_47.method2554()) {
			if (local11.method1444(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(II[III)Z")
	public boolean method5981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(16) Class1_Sub17 local16 = (Class1_Sub17) this.aClass111_47.method2547(); local16 != null; local16 = (Class1_Sub17) this.aClass111_47.method2554()) {
			if (local16.method1442(arg0, arg3, arg1)) {
				local16.method1445(arg2, arg0, arg3);
				return true;
			}
		}
		return false;
	}
}
