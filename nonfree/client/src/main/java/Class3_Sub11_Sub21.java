import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class3_Sub11_Sub21 extends Class3_Sub11 {

	@OriginalMember(owner = "client!wr", name = "C", descriptor = "I")
	public int anInt10855 = -1;

	@OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
	public int anInt10852 = 12800;

	@OriginalMember(owner = "client!wr", name = "E", descriptor = "Z")
	public boolean aBoolean824 = true;

	@OriginalMember(owner = "client!wr", name = "O", descriptor = "I")
	public int anInt10864 = 0;

	@OriginalMember(owner = "client!wr", name = "R", descriptor = "I")
	public int anInt10867 = 0;

	@OriginalMember(owner = "client!wr", name = "U", descriptor = "I")
	public int anInt10869 = 12800;

	@OriginalMember(owner = "client!wr", name = "V", descriptor = "I")
	public int anInt10870 = -1;

	@OriginalMember(owner = "client!wr", name = "M", descriptor = "I")
	public final int anInt10862;

	@OriginalMember(owner = "client!wr", name = "L", descriptor = "I")
	public final int anInt10861;

	@OriginalMember(owner = "client!wr", name = "S", descriptor = "Ljava/lang/String;")
	public final String aString129;

	@OriginalMember(owner = "client!wr", name = "z", descriptor = "Ljava/lang/String;")
	public final String aString128;

	@OriginalMember(owner = "client!wr", name = "F", descriptor = "Lclient!tm;")
	public final Class338 aClass338_237;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class3_Sub11_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt10862 = arg0;
		this.aBoolean824 = arg5;
		this.anInt10861 = arg3;
		this.anInt10870 = arg6;
		this.aString129 = arg2;
		this.aString128 = arg1;
		this.anInt10855 = arg4;
		if (this.anInt10870 == 255) {
			this.anInt10870 = 0;
		}
		this.aClass338_237 = new Class338();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(III[I)Z")
	public boolean method9350(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(11) Class3_Sub39 local11 = (Class3_Sub39) this.aClass338_237.method8177(); local11 != null; local11 = (Class3_Sub39) this.aClass338_237.method8168()) {
			if (local11.method5229(arg1, arg0)) {
				local11.method5225(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(III[II)Z")
	public boolean method9351(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) Class3_Sub39 local16 = (Class3_Sub39) this.aClass338_237.method8177(); local16 != null; local16 = (Class3_Sub39) this.aClass338_237.method8168()) {
			if (local16.method5227(arg0, arg1, arg3)) {
				local16.method5225(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "(I)V")
	public void method9354() {
		this.anInt10864 = 0;
		this.anInt10869 = 12800;
		this.anInt10867 = 0;
		this.anInt10852 = 12800;
		for (@Pc(27) Class3_Sub39 local27 = (Class3_Sub39) this.aClass338_237.method8177(); local27 != null; local27 = (Class3_Sub39) this.aClass338_237.method8168()) {
			if (local27.anInt5730 < this.anInt10869) {
				this.anInt10869 = local27.anInt5730;
			}
			if (local27.anInt5736 < this.anInt10852) {
				this.anInt10852 = local27.anInt5736;
			}
			if (this.anInt10867 < local27.anInt5738) {
				this.anInt10867 = local27.anInt5738;
			}
			if (this.anInt10864 < local27.anInt5732) {
				this.anInt10864 = local27.anInt5732;
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(III)Z")
	public boolean method9358(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(16) Class3_Sub39 local16 = (Class3_Sub39) this.aClass338_237.method8177(); local16 != null; local16 = (Class3_Sub39) this.aClass338_237.method8168()) {
			if (local16.method5229(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[IIB)Z")
	public boolean method9359(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(19) Class3_Sub39 local19 = (Class3_Sub39) this.aClass338_237.method8177(); local19 != null; local19 = (Class3_Sub39) this.aClass338_237.method8168()) {
			if (local19.method5228(arg0, arg2)) {
				local19.method5223(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}
}
