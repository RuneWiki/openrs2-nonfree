import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rka")
public final class Class141_Sub1 extends Class141 {

	@OriginalMember(owner = "client!rka", name = "l", descriptor = "[F")
	public static final float[] aFloatArray71 = new float[16384];

	@OriginalMember(owner = "client!rka", name = "m", descriptor = "[F")
	public static final float[] aFloatArray72 = new float[16384];

	@OriginalMember(owner = "client!rka", name = "e", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!rka", name = "k", descriptor = "Lclient!hl;")
	private final Class161 aClass161_1;

	@OriginalMember(owner = "client!rka", name = "h", descriptor = "Lclient!js;")
	private final Class197 aClass197_1;

	static {
		@Pc(76) double local76 = 3.834951969714103E-4D;
		for (@Pc(78) int local78 = 0; local78 < 16384; local78++) {
			aFloatArray71[local78] = (float) Math.sin(local76 * (double) local78);
			aFloatArray72[local78] = (float) Math.cos((double) local78 * local76);
		}
	}

	@OriginalMember(owner = "client!rka", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class141_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.aClass161_1 = new Class161(this.aSocket2.getInputStream(), arg1);
		this.aClass197_1 = new Class197(this.aSocket2.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!rka", name = "a", descriptor = "(III[B)I")
	@Override
	public int method7610(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		return this.aClass161_1.method4095(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!rka", name = "b", descriptor = "(I)V")
	@Override
	public void method7611() {
		this.aClass161_1.method4100();
		this.aClass197_1.method4783();
	}

	@OriginalMember(owner = "client!rka", name = "a", descriptor = "([BIII)V")
	@Override
	public void method7609(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		this.aClass197_1.method4779(arg0, arg1);
	}

	@OriginalMember(owner = "client!rka", name = "a", descriptor = "(B)V")
	@Override
	public void method7615() {
		try {
			this.aSocket2.close();
		} catch (@Pc(12) IOException local12) {
		}
		this.aClass161_1.method4098();
		this.aClass197_1.method4778();
	}

	@OriginalMember(owner = "client!rka", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7615();
	}

	@OriginalMember(owner = "client!rka", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method7613(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass161_1.method4099(arg0);
	}
}
