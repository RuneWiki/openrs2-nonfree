import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public abstract class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!jq", name = "D", descriptor = "I")
	public static int anInt7235 = -1;

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_268 = new Class145(81, 2);

	@OriginalMember(owner = "client!jq", name = "I", descriptor = "[Lclient!nb;")
	public static final Class157[] aClass157Array42 = new Class157[14];

	@OriginalMember(owner = "client!jq", name = "H", descriptor = "[Z")
	public static final boolean[] aBooleanArray67 = new boolean[8];

	@OriginalMember(owner = "client!jq", name = "x", descriptor = "Lclient!vs;")
	protected Class243 aClass243_41;

	@OriginalMember(owner = "client!jq", name = "y", descriptor = "Lclient!nc;")
	protected Class158 aClass158_41;

	@OriginalMember(owner = "client!jq", name = "G", descriptor = "I")
	public int anInt7238;

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "[Lclient!jq;")
	public final Class2_Sub3[] aClass2_Sub3Array42;

	@OriginalMember(owner = "client!jq", name = "M", descriptor = "Z")
	public boolean aBoolean487;

	static {
		new Class79("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(IZ)V", line = 247)
	protected Class2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass2_Sub3Array42 = new Class2_Sub3[arg0];
		this.aBoolean487 = arg1;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(IZI)[I", line = 4)
	protected final int[] method6474(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub3Array42[arg0].aBoolean487 ? this.aClass2_Sub3Array42[arg0].method6486(arg1) : this.aClass2_Sub3Array42[arg0].method6480(arg1)[0];
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIB)V", line = 46)
	public void method6476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt7238 == 255 ? arg0 : this.anInt7238;
		if (this.aBoolean487) {
			this.aClass158_41 = new Class158(local12, arg0, arg1);
		} else {
			this.aClass243_41 = new Class243(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V", line = 79)
	public void method6478() {
		if (this.aBoolean487) {
			this.aClass158_41.method3995();
			this.aClass158_41 = null;
		} else {
			this.aClass243_41.method6284();
			this.aClass243_41 = null;
		}
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)I", line = 105)
	public int method6479() {
		return -1;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(IB)[[I", line = 120)
	public int[][] method6480(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "(I)V", line = 140)
	public void method6481() {
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(Z)I", line = 174)
	public int method6483() {
		return -1;
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(IZI)[[I", line = 192)
	protected final int[][] method6484(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub3Array42[arg0].aBoolean487) {
			@Pc(22) int[] local22 = this.aClass2_Sub3Array42[arg0].method6486(arg1);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.aClass2_Sub3Array42[arg0].method6480(arg1);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!bt;I)V", line = 227)
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BI)[I", line = 237)
	public int[] method6486(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
}
