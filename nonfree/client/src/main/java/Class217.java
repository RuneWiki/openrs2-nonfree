import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class217 {

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
	private int anInt6818 = -1;

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
	private int anInt6814 = 0;

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "Lclient!m;")
	private Class127 aClass127_42 = new Class127();

	@OriginalMember(owner = "client!wn", name = "o", descriptor = "Z")
	public boolean aBoolean451 = false;

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
	private final int anInt6816;

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
	private final int anInt6819;

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "[Lclient!ls;")
	private Class3_Sub29[] aClass3_Sub29Array1;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(III)V")
	public Class217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6816 = arg0;
		this.anInt6819 = arg1;
		this.anIntArrayArray62 = new int[this.anInt6816][arg2];
		this.aClass3_Sub29Array1 = new Class3_Sub29[this.anInt6819];
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BI)[I")
	public int[] method5701(@OriginalArg(1) int arg0) {
		if (this.anInt6819 == this.anInt6816) {
			this.aBoolean451 = this.aClass3_Sub29Array1[arg0] == null;
			this.aClass3_Sub29Array1[arg0] = Static135.aClass3_Sub29_1;
			return this.anIntArrayArray62[arg0];
		} else if (this.anInt6816 == 1) {
			this.aBoolean451 = arg0 != this.anInt6818;
			this.anInt6818 = arg0;
			return this.anIntArrayArray62[0];
		} else {
			@Pc(25) Class3_Sub29 local25 = this.aClass3_Sub29Array1[arg0];
			if (local25 == null) {
				this.aBoolean451 = true;
				if (this.anInt6816 <= this.anInt6814) {
					@Pc(43) Class3_Sub29 local43 = (Class3_Sub29) this.aClass127_42.method3391();
					local25 = new Class3_Sub29(arg0, local43.anInt3940);
					this.aClass3_Sub29Array1[local43.anInt3946] = null;
					local43.method5717();
				} else {
					local25 = new Class3_Sub29(arg0, this.anInt6814);
					this.anInt6814++;
				}
				this.aClass3_Sub29Array1[arg0] = local25;
			} else {
				this.aBoolean451 = false;
			}
			this.aClass127_42.method3403(local25);
			return this.anIntArrayArray62[local25.anInt3940];
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
	public void method5703() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt6816; local15++) {
			this.anIntArrayArray62[local15] = null;
		}
		this.aClass3_Sub29Array1 = null;
		this.anIntArrayArray62 = null;
		this.aClass127_42.method3401();
		this.aClass127_42 = null;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)[[I")
	public int[][] method5706() {
		if (this.anInt6819 != this.anInt6816) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt6816; local27++) {
			this.aClass3_Sub29Array1[local27] = Static135.aClass3_Sub29_1;
		}
		return this.anIntArrayArray62;
	}
}
