import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class166 implements Interface3 {

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "[I")
	private int[] anIntArray438 = null;

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
	private int anInt4964 = -1;

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "Z")
	private boolean aBoolean324 = false;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V")
	public Class166() {
		if (Static178.aBoolean217 && Static178.anInt3496 >= 2) {
			this.method3965();
			@Pc(19) GL local19 = Static178.aGL1;
			local19.glBindTexture(34067, this.anIntArray438[0]);
			local19.glTexParameteri(34067, 10241, 9729);
			local19.glTexParameteri(34067, 10240, 9729);
			local19.glTexParameteri(34067, 32882, 33071);
			local19.glTexParameteri(34067, 10242, 33071);
			local19.glTexParameteri(34067, 10243, 33071);
			local19.glBindTexture(34067, this.anIntArray438[1]);
			local19.glTexParameteri(34067, 10241, 9729);
			local19.glTexParameteri(34067, 10240, 9729);
			local19.glTexParameteri(34067, 32882, 33071);
			local19.glTexParameteri(34067, 10242, 33071);
			local19.glTexParameteri(34067, 10243, 33071);
			local19.glBindTexture(34067, this.anIntArray438[2]);
			local19.glTexParameteri(34067, 10241, 9729);
			local19.glTexParameteri(34067, 10240, 9729);
			local19.glTexParameteri(34067, 32882, 33071);
			local19.glTexParameteri(34067, 10242, 33071);
			local19.glTexParameteri(34067, 10243, 33071);
			this.aBoolean324 = Static178.anInt3496 < 3;
		}
		this.method3964();
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "()V")
	@Override
	public void method3961() {
		@Pc(1) GL local1 = Static178.aGL1;
		Static178.method2769(1);
		if (Static298.aBoolean357) {
			local1.glCallList(this.anInt4964);
		} else {
			local1.glTexEnvi(8960, 34184, 34167);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
	@Override
	public void method3962(@OriginalArg(0) int arg0) {
		@Pc(1) GL local1 = Static178.aGL1;
		if (Static298.aBoolean357 && this.anIntArray438 != null) {
			local1.glActiveTexture(33985);
			local1.glBindTexture(34067, this.anIntArray438[arg0 - 1]);
			local1.glActiveTexture(33984);
		}
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "()I")
	@Override
	public int method3963() {
		return 4;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "()V")
	@Override
	public void method3960() {
		@Pc(1) GL local1 = Static178.aGL1;
		if (Static298.aBoolean357) {
			local1.glCallList(this.anInt4964 + 1);
		} else {
			local1.glTexEnvi(8960, 34184, 5890);
		}
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "()V")
	private void method3964() {
		@Pc(1) GL local1 = Static178.aGL1;
		this.anInt4964 = local1.glGenLists(2);
		local1.glNewList(this.anInt4964, 4864);
		if (this.anIntArray438 == null) {
			local1.glTexEnvi(8960, 34184, 34167);
		} else {
			local1.glActiveTexture(33985);
			local1.glTexGeni(8192, 9472, 34065);
			local1.glTexGeni(8193, 9472, 34065);
			local1.glTexGeni(8194, 9472, 34065);
			local1.glEnable(3168);
			local1.glEnable(3169);
			local1.glEnable(3170);
			local1.glEnable(34067);
			local1.glMatrixMode(5890);
			local1.glLoadIdentity();
			local1.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
			local1.glMatrixMode(5888);
			if (this.aBoolean324) {
				local1.glTexEnvi(8960, 34161, 260);
				local1.glTexEnvi(8960, 34192, 770);
				local1.glTexEnvi(8960, 34162, 7681);
				local1.glTexEnvi(8960, 34184, 34167);
			} else {
				local1.glTexEnvi(8960, 34161, 7681);
				local1.glTexEnvi(8960, 34176, 34168);
				local1.glTexEnvi(8960, 34162, 8448);
				local1.glActiveTexture(33986);
				local1.glTexEnvi(8960, 8704, 34160);
				local1.glTexEnvi(8960, 34161, 260);
				local1.glTexEnvi(8960, 34176, 34168);
				local1.glTexEnvi(8960, 34177, 34168);
				local1.glTexEnvi(8960, 34193, 770);
				local1.glTexEnvi(8960, 34162, 7681);
				local1.glTexEnvi(8960, 34184, 34167);
				local1.glBindTexture(3553, Static178.anInt3491);
				local1.glEnable(3553);
			}
			local1.glActiveTexture(33984);
		}
		local1.glEndList();
		local1.glNewList(this.anInt4964 + 1, 4864);
		if (this.anIntArray438 == null) {
			local1.glTexEnvi(8960, 34184, 5890);
		} else {
			local1.glActiveTexture(33985);
			local1.glDisable(3168);
			local1.glDisable(3169);
			local1.glDisable(3170);
			local1.glDisable(34067);
			local1.glMatrixMode(5890);
			local1.glLoadIdentity();
			local1.glMatrixMode(5888);
			if (this.aBoolean324) {
				local1.glTexEnvi(8960, 34161, 8448);
				local1.glTexEnvi(8960, 34192, 768);
				local1.glTexEnvi(8960, 34162, 8448);
				local1.glTexEnvi(8960, 34184, 5890);
			} else {
				local1.glTexEnvi(8960, 34161, 8448);
				local1.glTexEnvi(8960, 34176, 5890);
				local1.glActiveTexture(33986);
				local1.glTexEnvi(8960, 8704, 8448);
				local1.glTexEnvi(8960, 34161, 8448);
				local1.glTexEnvi(8960, 34176, 5890);
				local1.glTexEnvi(8960, 34193, 768);
				local1.glTexEnvi(8960, 34162, 8448);
				local1.glTexEnvi(8960, 34184, 5890);
				local1.glDisable(3553);
			}
			local1.glActiveTexture(33984);
		}
		local1.glEndList();
	}

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "()V")
	private void method3965() {
		@Pc(1) GL local1 = Static178.aGL1;
		if (this.anIntArray438 == null) {
			this.anIntArray438 = new int[3];
			local1.glGenTextures(3, this.anIntArray438, 0);
		}
		@Pc(19) byte[] local19 = new byte[4096];
		@Pc(22) byte[] local22 = new byte[4096];
		@Pc(25) byte[] local25 = new byte[4096];
		for (@Pc(27) int local27 = 0; local27 < 6; local27++) {
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = 0; local34 < 64; local34++) {
				for (@Pc(39) int local39 = 0; local39 < 64; local39++) {
					@Pc(51) float local51 = (float) local39 * 2.0F / 64.0F - 1.0F;
					@Pc(60) float local60 = (float) local34 * 2.0F / 64.0F - 1.0F;
					@Pc(75) float local75 = (float) (1.0D / Math.sqrt((double) (local51 * local51 + local60 * local60 + 1.0F)));
					@Pc(79) float local79 = local51 * local75;
					@Pc(83) float local83 = local60 * local75;
					@Pc(88) float local88;
					if (local27 == 0) {
						local88 = -local79;
					} else if (local27 == 1) {
						local88 = local79;
					} else if (local27 == 2) {
						local88 = local83;
					} else if (local27 == 3) {
						local88 = -local83;
					} else if (local27 == 4) {
						local88 = local75;
					} else {
						local88 = -local75;
					}
					@Pc(129) int local129;
					@Pc(137) int local137;
					@Pc(145) int local145;
					if (local88 > 0.0F) {
						local129 = (int) (Math.pow((double) local88, 96.0D) * 255.0D);
						local137 = (int) (Math.pow((double) local88, 36.0D) * 255.0D);
						local145 = (int) (Math.pow((double) local88, 12.0D) * 255.0D);
					} else {
						local145 = 0;
						local137 = 0;
						local129 = 0;
					}
					if (Static178.anInt3496 < 3) {
						local129 /= 5;
						local137 /= 5;
						local145 /= 5;
					} else {
						local129 /= 2;
						local137 /= 2;
						local145 /= 2;
					}
					local22[local32] = (byte) local129;
					local25[local32] = (byte) local137;
					local19[local32] = (byte) local145;
					local32++;
				}
			}
			local1.glBindTexture(34067, this.anIntArray438[0]);
			local1.glTexImage2D(local27 + 34069, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(local22));
			local1.glBindTexture(34067, this.anIntArray438[1]);
			local1.glTexImage2D(local27 + 34069, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(local25));
			local1.glBindTexture(34067, this.anIntArray438[2]);
			local1.glTexImage2D(local27 + 34069, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(local19));
			Static163.anInt3221 += 12288;
		}
	}
}
