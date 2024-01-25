import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class6_Sub2_Sub19 extends Class6_Sub2 {

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
	public int anInt5670 = 0;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
	public int anInt5668 = 12800;

	@OriginalMember(owner = "client!tg", name = "B", descriptor = "Z")
	public boolean aBoolean385 = true;

	@OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
	public int anInt5677 = 12800;

	@OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
	public int anInt5686 = -1;

	@OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
	public int anInt5684 = -1;

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
	public int anInt5675 = 0;

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "Ljava/lang/String;")
	public final String aString257;

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "I")
	public final int anInt5674;

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
	public final int anInt5671;

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "Ljava/lang/String;")
	public final String aString258;

	@OriginalMember(owner = "client!tg", name = "E", descriptor = "Lclient!vq;")
	public final Class211 aClass211_36;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class6_Sub2_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.aString257 = arg1;
		this.anInt5684 = arg4;
		this.anInt5686 = arg6;
		this.anInt5674 = arg0;
		this.anInt5671 = arg3;
		this.aString258 = arg2;
		this.aBoolean385 = arg5;
		if (this.anInt5686 == 255) {
			this.anInt5686 = 0;
		}
		this.aClass211_36 = new Class211();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III[I)Z")
	public boolean method5152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(17) Class6_Sub21 local17 = (Class6_Sub21) this.aClass211_36.method5594(); local17 != null; local17 = (Class6_Sub21) this.aClass211_36.method5582()) {
			if (local17.method3237(arg1, arg0)) {
				local17.method3239(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[IBI)Z")
	public boolean method5153(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(19) Class6_Sub21 local19 = (Class6_Sub21) this.aClass211_36.method5594(); local19 != null; local19 = (Class6_Sub21) this.aClass211_36.method5582()) {
			if (local19.method3232(arg0, arg2)) {
				local19.method3230(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIZ)Z")
	public boolean method5158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(16) Class6_Sub21 local16 = (Class6_Sub21) this.aClass211_36.method5594(); local16 != null; local16 = (Class6_Sub21) this.aClass211_36.method5582()) {
			if (local16.method3237(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IBII[I)Z")
	public boolean method5160(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(17) Class6_Sub21 local17 = (Class6_Sub21) this.aClass211_36.method5594(); local17 != null; local17 = (Class6_Sub21) this.aClass211_36.method5582()) {
			if (local17.method3233(arg0, arg2, arg1)) {
				local17.method3239(arg0, arg2, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V")
	public void method5161() {
		this.anInt5675 = 0;
		this.anInt5668 = 12800;
		this.anInt5670 = 0;
		this.anInt5677 = 12800;
		for (@Pc(23) Class6_Sub21 local23 = (Class6_Sub21) this.aClass211_36.method5594(); local23 != null; local23 = (Class6_Sub21) this.aClass211_36.method5582()) {
			if (this.anInt5677 > local23.anInt3083) {
				this.anInt5677 = local23.anInt3083;
			}
			if (local23.anInt3077 > this.anInt5670) {
				this.anInt5670 = local23.anInt3077;
			}
			if (local23.anInt3082 > this.anInt5675) {
				this.anInt5675 = local23.anInt3082;
			}
			if (local23.anInt3076 < this.anInt5668) {
				this.anInt5668 = local23.anInt3076;
			}
		}
	}
}
