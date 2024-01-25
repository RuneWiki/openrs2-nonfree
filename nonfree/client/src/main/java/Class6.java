import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class6 {

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "[B")
	public static final byte[] aByteArray7;

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "Lclient!nj;")
	private Class171 aClass171_1 = new Class171(64);

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "Lclient!mg;")
	private final Class160 aClass160_1;

	static {
		@Pc(3) int local3 = 0;
		aByteArray7 = new byte[32896];
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			for (@Pc(11) int local11 = 0; local11 <= local8; local11++) {
				aByteArray7[local3++] = (byte) (255.0D / Math.sqrt((double) ((float) (local8 * local8 + local11 * local11 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!al;ILclient!mg;)V")
	public Class6(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_1 = arg2;
		if (this.aClass160_1 != null) {
			@Pc(20) int local20 = this.aClass160_1.method3715() - 1;
			this.aClass160_1.method3722(local20);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
	public void method195() {
		@Pc(2) Class171 local2 = this.aClass171_1;
		synchronized (this.aClass171_1) {
			this.aClass171_1.method3934();
		}
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
	public void method197() {
		@Pc(2) Class171 local2 = this.aClass171_1;
		synchronized (this.aClass171_1) {
			this.aClass171_1.method3936();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)Lclient!jc;")
	public Class126 method198(@OriginalArg(0) int arg0) {
		@Pc(6) Class171 local6 = this.aClass171_1;
		@Pc(16) Class126 local16;
		synchronized (this.aClass171_1) {
			local16 = (Class126) this.aClass171_1.method3941((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(45) byte[] local45 = this.aClass160_1.method3696(Static292.method4205(arg0), Static27.method5784(arg0));
		local16 = new Class126();
		if (local45 != null) {
			local16.method2844(new Class2_Sub23(local45));
		}
		@Pc(61) Class171 local61 = this.aClass171_1;
		synchronized (this.aClass171_1) {
			this.aClass171_1.method3940((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)V")
	public void method199(@OriginalArg(1) int arg0) {
		@Pc(6) Class171 local6 = this.aClass171_1;
		synchronized (this.aClass171_1) {
			this.aClass171_1.method3936();
			this.aClass171_1 = new Class171(arg0);
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)V")
	public void method200() {
		@Pc(2) Class171 local2 = this.aClass171_1;
		synchronized (this.aClass171_1) {
			this.aClass171_1.method3933(5);
		}
	}
}
