import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HGKRJZKS")
public final class Class18 {

	@OriginalMember(owner = "client!HGKRJZKS", name = "c", descriptor = "I")
	private int anInt275;

	@OriginalMember(owner = "client!HGKRJZKS", name = "d", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!HGKRJZKS", name = "a", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!HGKRJZKS", name = "b", descriptor = "I")
	private int anInt274 = -47299;

	@OriginalMember(owner = "client!HGKRJZKS", name = "e", descriptor = "Lclient!KTAHMSMP;")
	private Class8_Sub1 aClass8_Sub1_15 = new Class8_Sub1();

	@OriginalMember(owner = "client!HGKRJZKS", name = "i", descriptor = "Lclient!LAPJVQGB;")
	private Class24 aClass24_1 = new Class24(-20780);

	@OriginalMember(owner = "client!HGKRJZKS", name = "f", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!HGKRJZKS", name = "g", descriptor = "I")
	private int anInt278;

	@OriginalMember(owner = "client!HGKRJZKS", name = "h", descriptor = "Lclient!FXRMRSFD;")
	private Class12 aClass12_1;

	@OriginalMember(owner = "client!HGKRJZKS", name = "<init>", descriptor = "(II)V")
	public Class18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt277 = arg1;
			this.anInt278 = arg1;
			this.aClass12_1 = new Class12(1024, (byte) 1);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("10139, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGKRJZKS", name = "a", descriptor = "(J)Lclient!KTAHMSMP;")
	public Class8_Sub1 method207(@OriginalArg(0) long arg0) {
		@Pc(5) Class8_Sub1 local5 = (Class8_Sub1) this.aClass12_1.method138(arg0);
		if (local5 == null) {
			this.anInt275++;
		} else {
			this.aClass24_1.method285(local5);
			this.anInt276++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!HGKRJZKS", name = "a", descriptor = "(IJLclient!KTAHMSMP;)V")
	public void method208(@OriginalArg(1) long arg0, @OriginalArg(2) Class8_Sub1 arg1) {
		try {
			if (this.anInt278 == 0) {
				@Pc(8) Class8_Sub1 local8 = this.aClass24_1.method286();
				local8.method554();
				local8.method555();
				if (local8 == this.aClass8_Sub1_15) {
					local8 = this.aClass24_1.method286();
					local8.method554();
					local8.method555();
				}
			} else {
				this.anInt278--;
			}
			this.aClass12_1.method139(arg0, arg1);
			this.aClass24_1.method285(arg1);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("98665, " + -43932 + ", " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGKRJZKS", name = "a", descriptor = "()V")
	public void method209() {
		while (true) {
			@Pc(3) Class8_Sub1 local3 = this.aClass24_1.method286();
			if (local3 == null) {
				this.anInt278 = this.anInt277;
				return;
			}
			local3.method554();
			local3.method555();
		}
	}
}
