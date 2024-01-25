import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oda")
public final class Class1_Sub2_Sub12 extends Class1_Sub2 {

	@OriginalMember(owner = "client!oda", name = "E", descriptor = "I")
	public int anInt6314 = 12800;

	@OriginalMember(owner = "client!oda", name = "C", descriptor = "I")
	public int anInt6312 = 0;

	@OriginalMember(owner = "client!oda", name = "A", descriptor = "I")
	public int anInt6311 = 0;

	@OriginalMember(owner = "client!oda", name = "M", descriptor = "Z")
	public boolean aBoolean469 = true;

	@OriginalMember(owner = "client!oda", name = "z", descriptor = "I")
	public int anInt6310 = 12800;

	@OriginalMember(owner = "client!oda", name = "H", descriptor = "I")
	public int anInt6317 = -1;

	@OriginalMember(owner = "client!oda", name = "J", descriptor = "I")
	public int anInt6319 = -1;

	@OriginalMember(owner = "client!oda", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString153;

	@OriginalMember(owner = "client!oda", name = "S", descriptor = "I")
	public final int anInt6324;

	@OriginalMember(owner = "client!oda", name = "R", descriptor = "Ljava/lang/String;")
	public final String aString154;

	@OriginalMember(owner = "client!oda", name = "x", descriptor = "I")
	public final int anInt6308;

	@OriginalMember(owner = "client!oda", name = "B", descriptor = "Lclient!ui;")
	public final Class295 aClass295_37;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class1_Sub2_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString153 = arg1;
		this.anInt6324 = arg0;
		this.aString154 = arg2;
		this.anInt6308 = arg3;
		this.anInt6319 = arg6;
		this.aBoolean469 = arg5;
		this.anInt6317 = arg4;
		if (this.anInt6319 == 255) {
			this.anInt6319 = 0;
		}
		this.aClass295_37 = new Class295();
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "([IIII)Z")
	public boolean method5737(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class1_Sub44 local11 = (Class1_Sub44) this.aClass295_37.method7543(); local11 != null; local11 = (Class1_Sub44) this.aClass295_37.method7540()) {
			if (local11.method6495(arg2, arg1)) {
				local11.method6488(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(I[III)Z")
	public boolean method5739(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class1_Sub44 local11 = (Class1_Sub44) this.aClass295_37.method7543(); local11 != null; local11 = (Class1_Sub44) this.aClass295_37.method7540()) {
			if (local11.method6485(arg2, arg1)) {
				local11.method6494(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Z[IIII)Z")
	public boolean method5741(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) Class1_Sub44 local11 = (Class1_Sub44) this.aClass295_37.method7543(); local11 != null; local11 = (Class1_Sub44) this.aClass295_37.method7540()) {
			if (local11.method6492(arg3, arg2, arg1)) {
				local11.method6494(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)V")
	public void method5742() {
		this.anInt6314 = 12800;
		this.anInt6310 = 12800;
		this.anInt6311 = 0;
		this.anInt6312 = 0;
		for (@Pc(31) Class1_Sub44 local31 = (Class1_Sub44) this.aClass295_37.method7543(); local31 != null; local31 = (Class1_Sub44) this.aClass295_37.method7540()) {
			if (this.anInt6310 > local31.anInt7213) {
				this.anInt6310 = local31.anInt7213;
			}
			if (this.anInt6311 < local31.anInt7214) {
				this.anInt6311 = local31.anInt7214;
			}
			if (this.anInt6314 > local31.anInt7203) {
				this.anInt6314 = local31.anInt7203;
			}
			if (local31.anInt7205 > this.anInt6312) {
				this.anInt6312 = local31.anInt7205;
			}
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZII)Z")
	public boolean method5743(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class1_Sub44 local11 = (Class1_Sub44) this.aClass295_37.method7543(); local11 != null; local11 = (Class1_Sub44) this.aClass295_37.method7540()) {
			if (local11.method6485(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}
}
