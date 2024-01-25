import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class9 {

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
	private int anInt339 = -1;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
	private int anInt341 = 0;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "Lclient!vr;")
	private Class258 aClass258_1 = new Class258();

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "Z")
	public boolean aBoolean15 = false;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
	private final int anInt337;

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
	private final int anInt342;

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "[Lclient!fa;")
	private Class4_Sub11[] aClass4_Sub11Array1;

	static {
		new Class242("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(III)V")
	public Class9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt337 = arg1;
		this.anInt342 = arg0;
		this.anIntArrayArray4 = new int[this.anInt342][arg2];
		this.aClass4_Sub11Array1 = new Class4_Sub11[this.anInt337];
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)[[I")
	public int[][] method276() {
		if (this.anInt337 != this.anInt342) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt342; local17++) {
			this.aClass4_Sub11Array1[local17] = Static323.aClass4_Sub11_1;
		}
		return this.anIntArrayArray4;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
	public void method278() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt342; local13++) {
			this.anIntArrayArray4[local13] = null;
		}
		this.anIntArrayArray4 = null;
		this.aClass4_Sub11Array1 = null;
		this.aClass258_1.method5527();
		this.aClass258_1 = null;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)[I")
	public int[] method279(@OriginalArg(0) int arg0) {
		if (this.anInt342 == this.anInt337) {
			this.aBoolean15 = this.aClass4_Sub11Array1[arg0] == null;
			this.aClass4_Sub11Array1[arg0] = Static323.aClass4_Sub11_1;
			return this.anIntArrayArray4[arg0];
		} else if (this.anInt342 == 1) {
			this.aBoolean15 = arg0 != this.anInt339;
			this.anInt339 = arg0;
			return this.anIntArrayArray4[0];
		} else {
			@Pc(24) Class4_Sub11 local24 = this.aClass4_Sub11Array1[arg0];
			if (local24 == null) {
				this.aBoolean15 = true;
				if (this.anInt341 < this.anInt342) {
					local24 = new Class4_Sub11(arg0, this.anInt341);
					this.anInt341++;
				} else {
					@Pc(64) Class4_Sub11 local64 = (Class4_Sub11) this.aClass258_1.method5536();
					local24 = new Class4_Sub11(arg0, local64.anInt2247);
					this.aClass4_Sub11Array1[local64.anInt2244] = null;
					local64.method5854();
				}
				this.aClass4_Sub11Array1[arg0] = local24;
			} else {
				this.aBoolean15 = false;
			}
			this.aClass258_1.method5529(local24);
			return this.anIntArrayArray4[local24.anInt2247];
		}
	}
}
