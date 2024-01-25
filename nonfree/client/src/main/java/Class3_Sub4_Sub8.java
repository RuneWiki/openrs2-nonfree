import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class3_Sub4_Sub8 extends Class3_Sub4 {

	@OriginalMember(owner = "client!et", name = "w", descriptor = "I")
	public int anInt2252 = 0;

	@OriginalMember(owner = "client!et", name = "H", descriptor = "Z")
	public boolean aBoolean181 = true;

	@OriginalMember(owner = "client!et", name = "E", descriptor = "I")
	public int anInt2258 = -1;

	@OriginalMember(owner = "client!et", name = "K", descriptor = "I")
	public int anInt2261 = 0;

	@OriginalMember(owner = "client!et", name = "L", descriptor = "I")
	public int anInt2262 = -1;

	@OriginalMember(owner = "client!et", name = "z", descriptor = "I")
	public int anInt2255 = 12800;

	@OriginalMember(owner = "client!et", name = "S", descriptor = "I")
	public int anInt2266 = 12800;

	@OriginalMember(owner = "client!et", name = "I", descriptor = "I")
	public final int anInt2260;

	@OriginalMember(owner = "client!et", name = "C", descriptor = "I")
	public final int anInt2257;

	@OriginalMember(owner = "client!et", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString15;

	@OriginalMember(owner = "client!et", name = "u", descriptor = "Ljava/lang/String;")
	public final String aString14;

	@OriginalMember(owner = "client!et", name = "B", descriptor = "Lclient!ug;")
	public final Class243 aClass243_15;

	static {
		new Class189("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class3_Sub4_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt2260 = arg0;
		this.anInt2258 = arg4;
		this.anInt2257 = arg3;
		this.anInt2262 = arg6;
		this.aString15 = arg1;
		this.aString14 = arg2;
		this.aBoolean181 = arg5;
		if (this.anInt2262 == 255) {
			this.anInt2262 = 0;
		}
		this.aClass243_15 = new Class243();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(III[I)Z")
	public boolean method1740(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(16) Class3_Sub44 local16 = (Class3_Sub44) this.aClass243_15.method5208(); local16 != null; local16 = (Class3_Sub44) this.aClass243_15.method5203()) {
			if (local16.method5746(arg1, arg0)) {
				local16.method5741(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I[III)Z")
	public boolean method1742(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) Class3_Sub44 local9 = (Class3_Sub44) this.aClass243_15.method5208(); local9 != null; local9 = (Class3_Sub44) this.aClass243_15.method5203()) {
			if (local9.method5744(arg1, arg2)) {
				local9.method5745(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(III)Z")
	public boolean method1744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(15) Class3_Sub44 local15 = (Class3_Sub44) this.aClass243_15.method5208(); local15 != null; local15 = (Class3_Sub44) this.aClass243_15.method5203()) {
			if (local15.method5746(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!et", name = "g", descriptor = "(I)V")
	public void method1745() {
		this.anInt2252 = 0;
		this.anInt2266 = 12800;
		this.anInt2255 = 12800;
		this.anInt2261 = 0;
		for (@Pc(23) Class3_Sub44 local23 = (Class3_Sub44) this.aClass243_15.method5208(); local23 != null; local23 = (Class3_Sub44) this.aClass243_15.method5203()) {
			if (local23.anInt7387 > this.anInt2252) {
				this.anInt2252 = local23.anInt7387;
			}
			if (this.anInt2266 > local23.anInt7386) {
				this.anInt2266 = local23.anInt7386;
			}
			if (this.anInt2255 > local23.anInt7383) {
				this.anInt2255 = local23.anInt7383;
			}
			if (this.anInt2261 < local23.anInt7395) {
				this.anInt2261 = local23.anInt7395;
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II[III)Z")
	public boolean method1749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(19) Class3_Sub44 local19 = (Class3_Sub44) this.aClass243_15.method5208(); local19 != null; local19 = (Class3_Sub44) this.aClass243_15.method5203()) {
			if (local19.method5743(arg3, arg1, arg0)) {
				local19.method5741(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}
}
