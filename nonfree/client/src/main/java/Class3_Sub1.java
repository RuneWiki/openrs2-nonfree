import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public abstract class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ku", name = "o", descriptor = "Lclient!tm;")
	protected Class313 aClass313_41;

	@OriginalMember(owner = "client!ku", name = "u", descriptor = "I")
	public int anInt10368;

	@OriginalMember(owner = "client!ku", name = "H", descriptor = "Lclient!mw;")
	protected Class220 aClass220_41;

	@OriginalMember(owner = "client!ku", name = "w", descriptor = "[Lclient!ku;")
	public final Class3_Sub1[] aClass3_Sub1Array42;

	@OriginalMember(owner = "client!ku", name = "p", descriptor = "Z")
	public boolean aBoolean850;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass3_Sub1Array42 = new Class3_Sub1[arg0];
		this.aBoolean850 = arg1;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IB)[I")
	public int[] method8359(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIB)[[I")
	protected final int[][] method8360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass3_Sub1Array42[arg0].aBoolean850) {
			@Pc(33) int[] local33 = this.aClass3_Sub1Array42[arg0].method8359(arg1);
			return new int[][] { local33, local33, local33 };
		} else {
			return this.aClass3_Sub1Array42[arg0].method8371(arg1);
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)[I")
	protected final int[] method8362(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass3_Sub1Array42[arg1].aBoolean850 ? this.aClass3_Sub1Array42[arg1].method8359(arg0) : this.aClass3_Sub1Array42[arg1].method8371(arg0)[0];
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IBI)V")
	public void method8363(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.anInt10368 == 255 ? arg0 : this.anInt10368;
		if (this.aBoolean850) {
			this.aClass313_41 = new Class313(local20, arg0, arg1);
		} else {
			this.aClass220_41 = new Class220(local20, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
	public void method8364() {
		if (this.aBoolean850) {
			this.aClass313_41.method7616();
			this.aClass313_41 = null;
		} else {
			this.aClass220_41.method5792();
			this.aClass220_41 = null;
		}
	}

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(B)V")
	public void method8365() {
	}

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "(B)I")
	public int method8367() {
		return -1;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)I")
	public int method8369() {
		return -1;
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(IB)[[I")
	public int[][] method8371(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILclient!fd;I)V")
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
	}
}
