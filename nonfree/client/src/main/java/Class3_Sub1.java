import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public abstract class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!en", name = "q", descriptor = "Lclient!ot;")
	protected Class281 aClass281_41;

	@OriginalMember(owner = "client!en", name = "u", descriptor = "I")
	public int anInt11242;

	@OriginalMember(owner = "client!en", name = "l", descriptor = "Lclient!qea;")
	protected Class305 aClass305_41;

	@OriginalMember(owner = "client!en", name = "n", descriptor = "[Lclient!en;")
	public final Class3_Sub1[] aClass3_Sub1Array42;

	@OriginalMember(owner = "client!en", name = "o", descriptor = "Z")
	public boolean aBoolean773;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass3_Sub1Array42 = new Class3_Sub1[arg0];
		this.aBoolean773 = arg1;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BI)[I")
	public int[] method9573(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
	public void method9574() {
		if (this.aBoolean773) {
			this.aClass305_41.method6988();
			this.aClass305_41 = null;
		} else {
			this.aClass281_41.method6496();
			this.aClass281_41 = null;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)I")
	public int method9575() {
		return -1;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIB)[[I")
	protected final int[][] method9576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass3_Sub1Array42[arg1].aBoolean773) {
			@Pc(34) int[] local34 = this.aClass3_Sub1Array42[arg1].method9573(arg0);
			return new int[][] { local34, local34, local34 };
		} else {
			return this.aClass3_Sub1Array42[arg1].method9580(arg0);
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(III)[I")
	protected final int[] method9577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass3_Sub1Array42[arg0].aBoolean773 ? this.aClass3_Sub1Array42[arg0].method9573(arg1) : this.aClass3_Sub1Array42[arg0].method9580(arg1)[0];
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
	public void method9578() {
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)I")
	public int method9579() {
		return -1;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(BI)[[I")
	public int[][] method9580(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IILclient!ika;)V")
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(III)V")
	public void method9583(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt11242 == 255 ? arg0 : this.anInt11242;
		if (this.aBoolean773) {
			this.aClass305_41 = new Class305(local15, arg0, arg1);
		} else {
			this.aClass281_41 = new Class281(local15, arg0, arg1);
		}
	}
}
