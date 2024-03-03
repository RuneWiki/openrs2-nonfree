import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "I")
	private final int anInt2597;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lclient!bf;II[BI)V", line = 21)
	public Class8_Sub2(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt2597 = arg2;
		@Pc(12) opengl local12 = arg0.anOpengl1;
		this.aClass19_Sub1_40.method848(this);
		local12.glPixelStorei(3317, 1);
		local12.glTexImage1D(this.anInt6869, 0, this.anInt6870, this.anInt2597, 0, arg4, 5121, ByteBuffer.wrap(arg3));
		local12.glPixelStorei(3317, 4);
		this.method6161(true);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZI)V", line = 6)
	public void method2613() {
		@Pc(3) opengl local3 = this.aClass19_Sub1_40.anOpengl1;
		this.aClass19_Sub1_40.method848(this);
		local3.glTexParameteri(this.anInt6869, 10242, 33071);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "()V", line = 18)
	@Override
	public void method6153() {
	}
}
