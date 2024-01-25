import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class7_Sub4_Sub9 extends Class7_Sub4 {

	@OriginalMember(owner = "client!hv", name = "q", descriptor = "I")
	public int anInt2999 = 0;

	@OriginalMember(owner = "client!hv", name = "r", descriptor = "I")
	public int anInt3000 = -1;

	@OriginalMember(owner = "client!hv", name = "x", descriptor = "I")
	public int anInt3006 = 12800;

	@OriginalMember(owner = "client!hv", name = "w", descriptor = "I")
	public int anInt3005 = 0;

	@OriginalMember(owner = "client!hv", name = "D", descriptor = "I")
	public int anInt3012 = -1;

	@OriginalMember(owner = "client!hv", name = "E", descriptor = "I")
	public int anInt3013 = 12800;

	@OriginalMember(owner = "client!hv", name = "J", descriptor = "Z")
	public boolean aBoolean179 = true;

	@OriginalMember(owner = "client!hv", name = "t", descriptor = "I")
	public final int anInt3002;

	@OriginalMember(owner = "client!hv", name = "G", descriptor = "Ljava/lang/String;")
	public final String aString34;

	@OriginalMember(owner = "client!hv", name = "A", descriptor = "I")
	public final int anInt3009;

	@OriginalMember(owner = "client!hv", name = "K", descriptor = "Ljava/lang/String;")
	public final String aString35;

	@OriginalMember(owner = "client!hv", name = "H", descriptor = "Lclient!fr;")
	public final Class85 aClass85_15;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class7_Sub4_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt3000 = arg6;
		this.anInt3002 = arg0;
		this.aString34 = arg2;
		this.aBoolean179 = arg5;
		this.anInt3012 = arg4;
		this.anInt3009 = arg3;
		this.aString35 = arg1;
		if (this.anInt3000 == 255) {
			this.anInt3000 = 0;
		}
		this.aClass85_15 = new Class85();
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(Z)V")
	public void method2407() {
		this.anInt3013 = 12800;
		this.anInt3005 = 0;
		this.anInt3006 = 12800;
		this.anInt2999 = 0;
		for (@Pc(23) Class7_Sub20 local23 = (Class7_Sub20) this.aClass85_15.method2010(); local23 != null; local23 = (Class7_Sub20) this.aClass85_15.method2000()) {
			if (local23.anInt2695 > this.anInt2999) {
				this.anInt2999 = local23.anInt2695;
			}
			if (this.anInt3006 > local23.anInt2686) {
				this.anInt3006 = local23.anInt2686;
			}
			if (local23.anInt2692 > this.anInt3005) {
				this.anInt3005 = local23.anInt2692;
			}
			if (this.anInt3013 > local23.anInt2684) {
				this.anInt3013 = local23.anInt2684;
			}
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)Z")
	public boolean method2408(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(17) Class7_Sub20 local17 = (Class7_Sub20) this.aClass85_15.method2010(); local17 != null; local17 = (Class7_Sub20) this.aClass85_15.method2000()) {
			if (local17.method2178(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZII[I)Z")
	public boolean method2409(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) Class7_Sub20 local11 = (Class7_Sub20) this.aClass85_15.method2010(); local11 != null; local11 = (Class7_Sub20) this.aClass85_15.method2000()) {
			if (local11.method2174(arg0, arg1, arg2)) {
				local11.method2176(arg3, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(III[I)Z")
	public boolean method2410(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(11) Class7_Sub20 local11 = (Class7_Sub20) this.aClass85_15.method2010(); local11 != null; local11 = (Class7_Sub20) this.aClass85_15.method2000()) {
			if (local11.method2178(arg1, arg0)) {
				local11.method2176(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BII[I)Z")
	public boolean method2412(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(11) Class7_Sub20 local11 = (Class7_Sub20) this.aClass85_15.method2010(); local11 != null; local11 = (Class7_Sub20) this.aClass85_15.method2000()) {
			if (local11.method2179(arg0, arg1)) {
				local11.method2177(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}
}
