import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class6_Sub2_Sub11 extends Class6_Sub2 {

	@OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
	public int anInt5224 = -1;

	@OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
	public int anInt5229 = 0;

	@OriginalMember(owner = "client!jj", name = "K", descriptor = "I")
	public int anInt5234 = 0;

	@OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
	public int anInt5238 = 12800;

	@OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
	public int anInt5233 = 12800;

	@OriginalMember(owner = "client!jj", name = "Q", descriptor = "Z")
	public boolean aBoolean357 = true;

	@OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
	public int anInt5235 = -1;

	@OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
	public final int anInt5230;

	@OriginalMember(owner = "client!jj", name = "T", descriptor = "Ljava/lang/String;")
	public final String aString57;

	@OriginalMember(owner = "client!jj", name = "R", descriptor = "I")
	public final int anInt5240;

	@OriginalMember(owner = "client!jj", name = "z", descriptor = "Ljava/lang/String;")
	public final String aString56;

	@OriginalMember(owner = "client!jj", name = "S", descriptor = "Lclient!ada;")
	public final Class8 aClass8_30;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class6_Sub2_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aBoolean357 = arg5;
		this.anInt5230 = arg0;
		this.anInt5224 = arg4;
		this.aString57 = arg1;
		this.anInt5235 = arg6;
		this.anInt5240 = arg3;
		this.aString56 = arg2;
		if (this.anInt5235 == 255) {
			this.anInt5235 = 0;
		}
		this.aClass8_30 = new Class8();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public void method4678() {
		this.anInt5229 = 0;
		this.anInt5233 = 12800;
		this.anInt5238 = 12800;
		this.anInt5234 = 0;
		for (@Pc(29) Class6_Sub23 local29 = (Class6_Sub23) this.aClass8_30.method149(); local29 != null; local29 = (Class6_Sub23) this.aClass8_30.method155()) {
			if (this.anInt5238 > local29.anInt4112) {
				this.anInt5238 = local29.anInt4112;
			}
			if (local29.anInt4124 > this.anInt5229) {
				this.anInt5229 = local29.anInt4124;
			}
			if (local29.anInt4117 > this.anInt5234) {
				this.anInt5234 = local29.anInt4117;
			}
			if (local29.anInt4118 < this.anInt5233) {
				this.anInt5233 = local29.anInt4118;
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BII)Z")
	public boolean method4679(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class6_Sub23 local11 = (Class6_Sub23) this.aClass8_30.method149(); local11 != null; local11 = (Class6_Sub23) this.aClass8_30.method155()) {
			if (local11.method3598(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIB[I)Z")
	public boolean method4680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(19) Class6_Sub23 local19 = (Class6_Sub23) this.aClass8_30.method149(); local19 != null; local19 = (Class6_Sub23) this.aClass8_30.method155()) {
			if (local19.method3596(arg1, arg0)) {
				local19.method3597(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIII[I)Z")
	public boolean method4682(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) Class6_Sub23 local11 = (Class6_Sub23) this.aClass8_30.method149(); local11 != null; local11 = (Class6_Sub23) this.aClass8_30.method155()) {
			if (local11.method3595(arg0, arg1, arg2)) {
				local11.method3593(arg1, arg3, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[IBI)Z")
	public boolean method4683(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(16) Class6_Sub23 local16 = (Class6_Sub23) this.aClass8_30.method149(); local16 != null; local16 = (Class6_Sub23) this.aClass8_30.method155()) {
			if (local16.method3598(arg2, arg0)) {
				local16.method3593(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}
}
