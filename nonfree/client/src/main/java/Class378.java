import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public final class Class378 {

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "I")
	public int anInt10310;

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "I")
	public int anInt10311;

	@OriginalMember(owner = "client!wia", name = "e", descriptor = "I")
	public int anInt10314;

	@OriginalMember(owner = "client!wia", name = "l", descriptor = "I")
	public int anInt10320;

	@OriginalMember(owner = "client!wia", name = "m", descriptor = "I")
	public int anInt10321;

	@OriginalMember(owner = "client!wia", name = "n", descriptor = "I")
	public int anInt10322;

	@OriginalMember(owner = "client!wia", name = "p", descriptor = "I")
	public int anInt10324;

	@OriginalMember(owner = "client!wia", name = "s", descriptor = "I")
	public int anInt10326;

	@OriginalMember(owner = "client!wia", name = "k", descriptor = "I")
	public int anInt10319 = 128;

	@OriginalMember(owner = "client!wia", name = "q", descriptor = "I")
	public int anInt10325 = 128;

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "I")
	public int anInt10312;

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(I)V")
	public Class378(@OriginalArg(0) int arg0) {
		this.anInt10312 = arg0;
	}

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(IIIIII)V")
	private Class378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt10312 = arg0;
		this.anInt10319 = arg2;
		this.anInt10325 = arg1;
		this.anInt10326 = arg3;
		this.anInt10324 = arg4;
		this.anInt10321 = arg5;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)Lclient!wia;")
	public Class378 method8773() {
		return new Class378(this.anInt10312, this.anInt10325, this.anInt10319, this.anInt10326, this.anInt10324, this.anInt10321);
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(ILclient!wia;)V")
	public void method8774(@OriginalArg(1) Class378 arg0) {
		this.anInt10325 = arg0.anInt10325;
		this.anInt10312 = arg0.anInt10312;
		this.anInt10324 = arg0.anInt10324;
		this.anInt10319 = arg0.anInt10319;
		this.anInt10321 = arg0.anInt10321;
		this.anInt10326 = arg0.anInt10326;
	}
}
