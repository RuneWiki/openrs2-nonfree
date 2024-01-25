import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public final class Class3_Sub4_Sub7 extends Class3_Sub4 {

	@OriginalMember(owner = "client!dga", name = "v", descriptor = "Z")
	public boolean aBoolean176 = true;

	@OriginalMember(owner = "client!dga", name = "C", descriptor = "I")
	public int anInt2244 = 12800;

	@OriginalMember(owner = "client!dga", name = "L", descriptor = "I")
	public int anInt2251 = 12800;

	@OriginalMember(owner = "client!dga", name = "x", descriptor = "I")
	public int anInt2239 = 0;

	@OriginalMember(owner = "client!dga", name = "D", descriptor = "I")
	public int anInt2245 = -1;

	@OriginalMember(owner = "client!dga", name = "I", descriptor = "I")
	public int anInt2248 = 0;

	@OriginalMember(owner = "client!dga", name = "O", descriptor = "I")
	public int anInt2253 = -1;

	@OriginalMember(owner = "client!dga", name = "M", descriptor = "Ljava/lang/String;")
	public final String aString25;

	@OriginalMember(owner = "client!dga", name = "B", descriptor = "I")
	public final int anInt2243;

	@OriginalMember(owner = "client!dga", name = "z", descriptor = "I")
	public final int anInt2241;

	@OriginalMember(owner = "client!dga", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString24;

	@OriginalMember(owner = "client!dga", name = "w", descriptor = "Lclient!ki;")
	public final Class183 aClass183_9;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class3_Sub4_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString25 = arg1;
		this.anInt2243 = arg0;
		this.anInt2245 = arg6;
		this.anInt2253 = arg4;
		this.anInt2241 = arg3;
		this.aBoolean176 = arg5;
		this.aString24 = arg2;
		if (this.anInt2245 == 255) {
			this.anInt2245 = 0;
		}
		this.aClass183_9 = new Class183();
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZI[II)Z")
	public boolean method2054(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) Class3_Sub5 local9 = (Class3_Sub5) this.aClass183_9.method4795(); local9 != null; local9 = (Class3_Sub5) this.aClass183_9.method4793()) {
			if (local9.method1068(arg2, arg0)) {
				local9.method1071(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "([IIBII)Z")
	public boolean method2055(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(14) Class3_Sub5 local14 = (Class3_Sub5) this.aClass183_9.method4795(); local14 != null; local14 = (Class3_Sub5) this.aClass183_9.method4793()) {
			if (local14.method1074(arg1, arg3, arg2)) {
				local14.method1071(arg0, arg3, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "([IBII)Z")
	public boolean method2057(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) Class3_Sub5 local9 = (Class3_Sub5) this.aClass183_9.method4795(); local9 != null; local9 = (Class3_Sub5) this.aClass183_9.method4793()) {
			if (local9.method1070(arg1, arg2)) {
				local9.method1069(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(III)Z")
	public boolean method2059(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(9) Class3_Sub5 local9 = (Class3_Sub5) this.aClass183_9.method4795(); local9 != null; local9 = (Class3_Sub5) this.aClass183_9.method4793()) {
			if (local9.method1068(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)V")
	public void method2061() {
		this.anInt2239 = 0;
		this.anInt2251 = 12800;
		this.anInt2244 = 12800;
		this.anInt2248 = 0;
		for (@Pc(31) Class3_Sub5 local31 = (Class3_Sub5) this.aClass183_9.method4795(); local31 != null; local31 = (Class3_Sub5) this.aClass183_9.method4793()) {
			if (local31.anInt965 < this.anInt2244) {
				this.anInt2244 = local31.anInt965;
			}
			if (this.anInt2251 > local31.anInt977) {
				this.anInt2251 = local31.anInt977;
			}
			if (this.anInt2239 < local31.anInt974) {
				this.anInt2239 = local31.anInt974;
			}
			if (this.anInt2248 < local31.anInt976) {
				this.anInt2248 = local31.anInt976;
			}
		}
	}
}
