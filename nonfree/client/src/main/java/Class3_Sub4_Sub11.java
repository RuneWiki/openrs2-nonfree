import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class3_Sub4_Sub11 extends Class3_Sub4 {

	@OriginalMember(owner = "client!gw", name = "s", descriptor = "Z")
	public boolean aBoolean256 = true;

	@OriginalMember(owner = "client!gw", name = "C", descriptor = "I")
	public int anInt3861 = 12800;

	@OriginalMember(owner = "client!gw", name = "w", descriptor = "I")
	public int anInt3855 = -1;

	@OriginalMember(owner = "client!gw", name = "G", descriptor = "I")
	public int anInt3863 = 12800;

	@OriginalMember(owner = "client!gw", name = "B", descriptor = "I")
	public int anInt3860 = 0;

	@OriginalMember(owner = "client!gw", name = "L", descriptor = "I")
	public int anInt3867 = 0;

	@OriginalMember(owner = "client!gw", name = "J", descriptor = "I")
	public int anInt3865 = -1;

	@OriginalMember(owner = "client!gw", name = "z", descriptor = "I")
	public final int anInt3858;

	@OriginalMember(owner = "client!gw", name = "D", descriptor = "I")
	public final int anInt3862;

	@OriginalMember(owner = "client!gw", name = "I", descriptor = "Ljava/lang/String;")
	public final String aString40;

	@OriginalMember(owner = "client!gw", name = "r", descriptor = "Ljava/lang/String;")
	public final String aString39;

	@OriginalMember(owner = "client!gw", name = "v", descriptor = "Lclient!mr;")
	public final Class223 aClass223_17;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class3_Sub4_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt3855 = arg6;
		this.aBoolean256 = arg5;
		this.anInt3858 = arg0;
		this.anInt3862 = arg3;
		this.anInt3865 = arg4;
		this.aString40 = arg1;
		this.aString39 = arg2;
		if (this.anInt3855 == 255) {
			this.anInt3855 = 0;
		}
		this.aClass223_17 = new Class223();
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "([IBII)Z")
	public boolean method3413(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class3_Sub41 local11 = (Class3_Sub41) this.aClass223_17.method5874(); local11 != null; local11 = (Class3_Sub41) this.aClass223_17.method5870()) {
			if (local11.method6502(arg1, arg2)) {
				local11.method6503(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "([IIIII)Z")
	public boolean method3414(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(21) Class3_Sub41 local21 = (Class3_Sub41) this.aClass223_17.method5874(); local21 != null; local21 = (Class3_Sub41) this.aClass223_17.method5870()) {
			if (local21.method6507(arg3, arg1, arg2)) {
				local21.method6503(arg0, arg1, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZII)Z")
	public boolean method3415(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(21) Class3_Sub41 local21 = (Class3_Sub41) this.aClass223_17.method5874(); local21 != null; local21 = (Class3_Sub41) this.aClass223_17.method5870()) {
			if (local21.method6502(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I[III)Z")
	public boolean method3418(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) Class3_Sub41 local11 = (Class3_Sub41) this.aClass223_17.method5874(); local11 != null; local11 = (Class3_Sub41) this.aClass223_17.method5870()) {
			if (local11.method6506(arg2, arg0)) {
				local11.method6504(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)V")
	public void method3419() {
		this.anInt3860 = 0;
		this.anInt3861 = 12800;
		this.anInt3867 = 0;
		this.anInt3863 = 12800;
		for (@Pc(27) Class3_Sub41 local27 = (Class3_Sub41) this.aClass223_17.method5874(); local27 != null; local27 = (Class3_Sub41) this.aClass223_17.method5870()) {
			if (this.anInt3863 > local27.anInt7509) {
				this.anInt3863 = local27.anInt7509;
			}
			if (local27.anInt7506 < this.anInt3861) {
				this.anInt3861 = local27.anInt7506;
			}
			if (local27.anInt7492 > this.anInt3860) {
				this.anInt3860 = local27.anInt7492;
			}
			if (this.anInt3867 < local27.anInt7508) {
				this.anInt3867 = local27.anInt7508;
			}
		}
	}
}
