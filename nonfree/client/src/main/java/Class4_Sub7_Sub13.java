import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class4_Sub7_Sub13 extends Class4_Sub7 {

	@OriginalMember(owner = "client!o", name = "t", descriptor = "I")
	public int anInt6619 = 0;

	@OriginalMember(owner = "client!o", name = "B", descriptor = "Z")
	public boolean aBoolean495 = true;

	@OriginalMember(owner = "client!o", name = "G", descriptor = "I")
	public int anInt6627 = -1;

	@OriginalMember(owner = "client!o", name = "K", descriptor = "I")
	public int anInt6630 = 0;

	@OriginalMember(owner = "client!o", name = "E", descriptor = "I")
	public int anInt6625 = 12800;

	@OriginalMember(owner = "client!o", name = "H", descriptor = "I")
	public int anInt6628 = -1;

	@OriginalMember(owner = "client!o", name = "F", descriptor = "I")
	public int anInt6626 = 12800;

	@OriginalMember(owner = "client!o", name = "z", descriptor = "I")
	public final int anInt6623;

	@OriginalMember(owner = "client!o", name = "D", descriptor = "Ljava/lang/String;")
	public final String aString76;

	@OriginalMember(owner = "client!o", name = "I", descriptor = "Ljava/lang/String;")
	public final String aString77;

	@OriginalMember(owner = "client!o", name = "J", descriptor = "I")
	public final int anInt6629;

	@OriginalMember(owner = "client!o", name = "A", descriptor = "Lclient!gj;")
	public final Class124 aClass124_41;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class4_Sub7_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt6623 = arg3;
		this.aString76 = arg1;
		this.aBoolean495 = arg5;
		this.aString77 = arg2;
		this.anInt6629 = arg0;
		this.anInt6628 = arg4;
		this.anInt6627 = arg6;
		if (this.anInt6627 == 255) {
			this.anInt6627 = 0;
		}
		this.aClass124_41 = new Class124();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)Z")
	public boolean method5522(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(16) Class4_Sub27 local16 = (Class4_Sub27) this.aClass124_41.method3267(); local16 != null; local16 = (Class4_Sub27) this.aClass124_41.method3273()) {
			if (local16.method4399(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public void method5523() {
		this.anInt6625 = 12800;
		this.anInt6630 = 0;
		this.anInt6619 = 0;
		this.anInt6626 = 12800;
		for (@Pc(23) Class4_Sub27 local23 = (Class4_Sub27) this.aClass124_41.method3267(); local23 != null; local23 = (Class4_Sub27) this.aClass124_41.method3273()) {
			if (this.anInt6630 < local23.anInt5200) {
				this.anInt6630 = local23.anInt5200;
			}
			if (local23.anInt5192 < this.anInt6626) {
				this.anInt6626 = local23.anInt5192;
			}
			if (this.anInt6619 < local23.anInt5197) {
				this.anInt6619 = local23.anInt5197;
			}
			if (local23.anInt5193 < this.anInt6625) {
				this.anInt6625 = local23.anInt5193;
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "([IBII)Z")
	public boolean method5524(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) Class4_Sub27 local9 = (Class4_Sub27) this.aClass124_41.method3267(); local9 != null; local9 = (Class4_Sub27) this.aClass124_41.method3273()) {
			if (local9.method4401(arg1, arg2)) {
				local9.method4402(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III[I)Z")
	public boolean method5526(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(11) Class4_Sub27 local11 = (Class4_Sub27) this.aClass124_41.method3267(); local11 != null; local11 = (Class4_Sub27) this.aClass124_41.method3273()) {
			if (local11.method4399(arg0, arg1)) {
				local11.method4398(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III[II)Z")
	public boolean method5528(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(19) Class4_Sub27 local19 = (Class4_Sub27) this.aClass124_41.method3267(); local19 != null; local19 = (Class4_Sub27) this.aClass124_41.method3273()) {
			if (local19.method4397(arg1, arg0, arg3)) {
				local19.method4398(arg1, arg3, arg2);
				return true;
			}
		}
		return false;
	}
}
