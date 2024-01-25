import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class3_Sub7_Sub13 extends Class3_Sub7 {

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "I")
	public int anInt3137 = -1;

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
	public int anInt3133 = 0;

	@OriginalMember(owner = "client!ka", name = "D", descriptor = "I")
	public int anInt3138 = 12800;

	@OriginalMember(owner = "client!ka", name = "B", descriptor = "Z")
	public boolean aBoolean169 = true;

	@OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
	public int anInt3136 = 12800;

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "I")
	public int anInt3134 = -1;

	@OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
	public int anInt3146 = 0;

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
	public final int anInt3135;

	@OriginalMember(owner = "client!ka", name = "E", descriptor = "Ljava/lang/String;")
	public final String aString120;

	@OriginalMember(owner = "client!ka", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString119;

	@OriginalMember(owner = "client!ka", name = "J", descriptor = "I")
	public final int anInt3143;

	@OriginalMember(owner = "client!ka", name = "w", descriptor = "Lclient!m;")
	public final Class127 aClass127_17;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class3_Sub7_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.anInt3134 = arg4;
		this.anInt3135 = arg3;
		this.aString120 = arg2;
		this.anInt3137 = arg6;
		this.aString119 = arg1;
		this.anInt3143 = arg0;
		this.aBoolean169 = arg5;
		if (this.anInt3137 == 255) {
			this.anInt3137 = 0;
		}
		this.aClass127_17 = new Class127();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIB[I)Z")
	public boolean method2563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(18) Class3_Sub1 local18 = (Class3_Sub1) this.aClass127_17.method3402(); local18 != null; local18 = (Class3_Sub1) this.aClass127_17.method3400()) {
			if (local18.method29(arg0, arg1)) {
				local18.method30(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[III)Z")
	public boolean method2565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(11) Class3_Sub1 local11 = (Class3_Sub1) this.aClass127_17.method3402(); local11 != null; local11 = (Class3_Sub1) this.aClass127_17.method3400()) {
			if (local11.method25(arg1, arg3, arg0)) {
				local11.method26(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Z")
	public boolean method2566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(21) Class3_Sub1 local21 = (Class3_Sub1) this.aClass127_17.method3402(); local21 != null; local21 = (Class3_Sub1) this.aClass127_17.method3400()) {
			if (local21.method24(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[III)Z")
	public boolean method2568(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class3_Sub1 local11 = (Class3_Sub1) this.aClass127_17.method3402(); local11 != null; local11 = (Class3_Sub1) this.aClass127_17.method3400()) {
			if (local11.method24(arg0, arg2)) {
				local11.method26(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(Z)V")
	public void method2569() {
		this.anInt3138 = 12800;
		this.anInt3146 = 0;
		this.anInt3133 = 0;
		this.anInt3136 = 12800;
		for (@Pc(23) Class3_Sub1 local23 = (Class3_Sub1) this.aClass127_17.method3402(); local23 != null; local23 = (Class3_Sub1) this.aClass127_17.method3400()) {
			if (local23.anInt54 > this.anInt3133) {
				this.anInt3133 = local23.anInt54;
			}
			if (this.anInt3138 > local23.anInt50) {
				this.anInt3138 = local23.anInt50;
			}
			if (local23.anInt55 > this.anInt3146) {
				this.anInt3146 = local23.anInt55;
			}
			if (local23.anInt45 < this.anInt3136) {
				this.anInt3136 = local23.anInt45;
			}
		}
	}
}
