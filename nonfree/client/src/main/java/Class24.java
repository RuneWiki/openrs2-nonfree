import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public final class Class24 {

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "I")
	private int anInt840 = -1;

	@OriginalMember(owner = "client!bca", name = "h", descriptor = "I")
	private int anInt845 = 0;

	@OriginalMember(owner = "client!bca", name = "d", descriptor = "Lclient!kba;")
	private Class163 aClass163_10 = new Class163();

	@OriginalMember(owner = "client!bca", name = "o", descriptor = "Z")
	public boolean aBoolean80 = false;

	@OriginalMember(owner = "client!bca", name = "g", descriptor = "I")
	private final int anInt844;

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "I")
	private final int anInt842;

	@OriginalMember(owner = "client!bca", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!bca", name = "l", descriptor = "[Lclient!vfa;")
	private Class6_Sub49[] aClass6_Sub49Array1;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(III)V")
	public Class24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt844 = arg1;
		this.anInt842 = arg0;
		this.anIntArrayArray3 = new int[this.anInt842][arg2];
		this.aClass6_Sub49Array1 = new Class6_Sub49[this.anInt844];
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
	public void method787() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt842; local7++) {
			this.anIntArrayArray3[local7] = null;
		}
		this.anIntArrayArray3 = null;
		this.aClass6_Sub49Array1 = null;
		this.aClass163_10.method4970();
		this.aClass163_10 = null;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(BI)[I")
	public int[] method788(@OriginalArg(1) int arg0) {
		if (this.anInt844 == this.anInt842) {
			this.aBoolean80 = this.aClass6_Sub49Array1[arg0] == null;
			this.aClass6_Sub49Array1[arg0] = Static254.aClass6_Sub49_1;
			return this.anIntArrayArray3[arg0];
		} else if (this.anInt842 == 1) {
			this.aBoolean80 = arg0 != this.anInt840;
			this.anInt840 = arg0;
			return this.anIntArrayArray3[0];
		} else {
			@Pc(45) Class6_Sub49 local45 = this.aClass6_Sub49Array1[arg0];
			if (local45 == null) {
				this.aBoolean80 = true;
				if (this.anInt845 < this.anInt842) {
					local45 = new Class6_Sub49(arg0, this.anInt845);
					this.anInt845++;
				} else {
					@Pc(81) Class6_Sub49 local81 = (Class6_Sub49) this.aClass163_10.method4975();
					local45 = new Class6_Sub49(arg0, local81.anInt10173);
					this.aClass6_Sub49Array1[local81.anInt10168] = null;
					local81.method8792();
				}
				this.aClass6_Sub49Array1[arg0] = local45;
			} else {
				this.aBoolean80 = false;
			}
			this.aClass163_10.method4971(local45);
			return this.anIntArrayArray3[local45.anInt10173];
		}
	}

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(I)[[I")
	public int[][] method789() {
		if (this.anInt842 != this.anInt844) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt842; local29++) {
			this.aClass6_Sub49Array1[local29] = Static254.aClass6_Sub49_1;
		}
		return this.anIntArrayArray3;
	}
}
