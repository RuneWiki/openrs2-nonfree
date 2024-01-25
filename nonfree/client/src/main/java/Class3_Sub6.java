import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public abstract class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
	public int anInt10200;

	@OriginalMember(owner = "client!ng", name = "t", descriptor = "Lclient!kaa;")
	protected Class170 aClass170_41;

	@OriginalMember(owner = "client!ng", name = "w", descriptor = "Lclient!vda;")
	protected Class339 aClass339_41;

	@OriginalMember(owner = "client!ng", name = "B", descriptor = "Z")
	public boolean aBoolean720;

	@OriginalMember(owner = "client!ng", name = "s", descriptor = "[Lclient!ng;")
	public final Class3_Sub6[] aClass3_Sub6Array42;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean720 = arg1;
		this.aClass3_Sub6Array42 = new Class3_Sub6[arg0];
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)[I")
	protected final int[] method8001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass3_Sub6Array42[arg0].aBoolean720 ? this.aClass3_Sub6Array42[arg0].method8009(arg1) : this.aClass3_Sub6Array42[arg0].method8006(arg1)[0];
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	public void method8002() {
		if (this.aBoolean720) {
			this.aClass170_41.method4100();
			this.aClass170_41 = null;
		} else {
			this.aClass339_41.method7665();
			this.aClass339_41 = null;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLclient!ie;I)V")
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(III)V")
	public void method8004(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt10200 == 255 ? arg1 : this.anInt10200;
		if (this.aBoolean720) {
			this.aClass170_41 = new Class170(local12, arg1, arg0);
		} else {
			this.aClass339_41 = new Class339(local12, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIB)[[I")
	protected final int[][] method8005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass3_Sub6Array42[arg0].aBoolean720) {
			@Pc(31) int[] local31 = this.aClass3_Sub6Array42[arg0].method8009(arg1);
			return new int[][] { local31, local31, local31 };
		} else {
			return this.aClass3_Sub6Array42[arg0].method8006(arg1);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)[[I")
	public int[][] method8006(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)I")
	public int method8007() {
		return -1;
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)I")
	public int method8008() {
		return -1;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)[I")
	public int[] method8009(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
	public void method8012() {
	}
}
