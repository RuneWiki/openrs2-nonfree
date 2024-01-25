import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class187 {

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "Lclient!wd;")
	public Class214 aClass214_19;

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "B")
	public byte aByte79;

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "Lclient!fp;")
	public Class44_Sub2 aClass44_Sub2_1;

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "Lclient!he;")
	public Class90 aClass90_2;

	@OriginalMember(owner = "client!sk", name = "p", descriptor = "Lclient!sk;")
	public Class187 aClass187_1;

	@OriginalMember(owner = "client!sk", name = "q", descriptor = "Z")
	public boolean aBoolean374;

	@OriginalMember(owner = "client!sk", name = "r", descriptor = "B")
	public byte aByte81;

	@OriginalMember(owner = "client!sk", name = "s", descriptor = "Lclient!ip;")
	public Class44_Sub3 aClass44_Sub3_1;

	@OriginalMember(owner = "client!sk", name = "t", descriptor = "S")
	public short aShort82;

	@OriginalMember(owner = "client!sk", name = "u", descriptor = "B")
	public byte aByte82;

	@OriginalMember(owner = "client!sk", name = "w", descriptor = "Lclient!js;")
	public Class44_Sub5 aClass44_Sub5_1;

	@OriginalMember(owner = "client!sk", name = "x", descriptor = "Lclient!im;")
	public Class44_Sub1 aClass44_Sub1_1;

	@OriginalMember(owner = "client!sk", name = "y", descriptor = "Lclient!im;")
	public Class44_Sub1 aClass44_Sub1_2;

	@OriginalMember(owner = "client!sk", name = "z", descriptor = "Z")
	public boolean aBoolean375;

	@OriginalMember(owner = "client!sk", name = "A", descriptor = "B")
	public byte aByte84;

	@OriginalMember(owner = "client!sk", name = "B", descriptor = "Lclient!js;")
	public Class44_Sub5 aClass44_Sub5_2;

	@OriginalMember(owner = "client!sk", name = "C", descriptor = "Z")
	public boolean aBoolean376;

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "B")
	public byte aByte80 = 0;

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "S")
	public final short aShort80;

	@OriginalMember(owner = "client!sk", name = "o", descriptor = "S")
	public final short aShort81;

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "B")
	public byte aByte78;

	@OriginalMember(owner = "client!sk", name = "v", descriptor = "B")
	public byte aByte83;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(III)V")
	public Class187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort80 = (short) arg1;
		this.aShort81 = (short) arg2;
		this.aByte83 = this.aByte78 = (byte) arg0;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
	public void method4951() {
		while (this.aClass214_19 != null) {
			@Pc(11) Class214 local11 = this.aClass214_19.aClass214_21;
			this.aClass214_19.method5645();
			this.aClass214_19 = local11;
		}
		this.aByte80 = 0;
	}
}
