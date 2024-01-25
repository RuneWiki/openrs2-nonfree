import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class10_Sub1_Sub2 extends Class10_Sub1 {

	@OriginalMember(owner = "client!ao", name = "y", descriptor = "I")
	public int anInt241 = -1;

	@OriginalMember(owner = "client!ao", name = "A", descriptor = "I")
	public int anInt243 = -1;

	@OriginalMember(owner = "client!ao", name = "C", descriptor = "I")
	public int anInt245 = 12800;

	@OriginalMember(owner = "client!ao", name = "O", descriptor = "I")
	public int anInt253 = 12800;

	@OriginalMember(owner = "client!ao", name = "N", descriptor = "Z")
	public boolean aBoolean20 = true;

	@OriginalMember(owner = "client!ao", name = "v", descriptor = "I")
	public int anInt240 = 0;

	@OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
	public int anInt249 = 0;

	@OriginalMember(owner = "client!ao", name = "P", descriptor = "I")
	public final int anInt254;

	@OriginalMember(owner = "client!ao", name = "Q", descriptor = "Ljava/lang/String;")
	public final String aString4;

	@OriginalMember(owner = "client!ao", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString3;

	@OriginalMember(owner = "client!ao", name = "K", descriptor = "I")
	public final int anInt250;

	@OriginalMember(owner = "client!ao", name = "D", descriptor = "Lclient!mf;")
	public final Class163 aClass163_3;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class10_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt243 = arg4;
		this.anInt254 = arg3;
		this.aString4 = arg1;
		this.anInt241 = arg6;
		this.aString3 = arg2;
		this.anInt250 = arg0;
		this.aBoolean20 = arg5;
		if (this.anInt241 == 255) {
			this.anInt241 = 0;
		}
		this.aClass163_3 = new Class163();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(III[I)Z")
	public boolean method197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(19) Class10_Sub41 local19 = (Class10_Sub41) this.aClass163_3.method3620(); local19 != null; local19 = (Class10_Sub41) this.aClass163_3.method3621()) {
			if (local19.method5270(arg1, arg0)) {
				local19.method5269(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V")
	public void method199() {
		this.anInt240 = 0;
		this.anInt253 = 12800;
		this.anInt245 = 12800;
		this.anInt249 = 0;
		for (@Pc(23) Class10_Sub41 local23 = (Class10_Sub41) this.aClass163_3.method3620(); local23 != null; local23 = (Class10_Sub41) this.aClass163_3.method3621()) {
			if (this.anInt245 > local23.anInt6719) {
				this.anInt245 = local23.anInt6719;
			}
			if (this.anInt240 < local23.anInt6718) {
				this.anInt240 = local23.anInt6718;
			}
			if (local23.anInt6728 > this.anInt249) {
				this.anInt249 = local23.anInt6728;
			}
			if (local23.anInt6733 < this.anInt253) {
				this.anInt253 = local23.anInt6733;
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIB[I)Z")
	public boolean method200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(16) Class10_Sub41 local16 = (Class10_Sub41) this.aClass163_3.method3620(); local16 != null; local16 = (Class10_Sub41) this.aClass163_3.method3621()) {
			if (local16.method5271(arg1, arg0)) {
				local16.method5268(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BI[III)Z")
	public boolean method201(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(21) Class10_Sub41 local21 = (Class10_Sub41) this.aClass163_3.method3620(); local21 != null; local21 = (Class10_Sub41) this.aClass163_3.method3621()) {
			if (local21.method5276(arg0, arg2, arg3)) {
				local21.method5268(arg2, arg3, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BII)Z")
	public boolean method202(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class10_Sub41 local11 = (Class10_Sub41) this.aClass163_3.method3620(); local11 != null; local11 = (Class10_Sub41) this.aClass163_3.method3621()) {
			if (local11.method5271(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}
}
